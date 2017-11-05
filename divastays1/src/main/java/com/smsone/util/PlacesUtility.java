package com.smsone.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

public class PlacesUtility {

	private static final String API_URL_1 = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input=";
	private static final String API_URL_2 = "&types=geocode&language=en&key=";
	private static final String API_KEY = "AIzaSyD0Ifl5Im_YQSjLADkywjjI5P34z1GCxMk";

	@SuppressWarnings("unchecked")
	public static List<String> getData(String query) throws IOException {
		// locations list to return
		List<String> matched = new ArrayList<String>();
		// Build API URL
		StringBuilder sb = new StringBuilder(API_URL_1).append(query).append(API_URL_2).append(API_KEY);
		URL url = new URL(sb.toString());
		// Create instance of connection to the API URL
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		// We will get the result in json format
		conn.setRequestProperty("Accept", "application/json");
		conn.setDoOutput(true);
		// Read response body from the stream returned by getInputStream()
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()), "UTF-8"));
		StringBuilder rep = new StringBuilder();
		String output = "";
		while ((output = br.readLine()) != null) {
			rep.append(output);
		}
	    // Transform output to json
		LinkedTreeMap<String, Object> jsonResult = new Gson().fromJson(rep.toString(), LinkedTreeMap.class);
		// Get predictions list
		List<LinkedTreeMap<String, Object>> predictions = (ArrayList<LinkedTreeMap<String, Object>>) jsonResult.get("predictions");
		// Retrieve locations list
		if (null != predictions && !predictions.isEmpty()) {
			for (LinkedTreeMap<String, Object> prediction : predictions) {
				Object address = prediction.get("description");
				matched.add(address.toString());
			}
		}
		// Close connection instance
		conn.disconnect();
		return matched;
	}
}
