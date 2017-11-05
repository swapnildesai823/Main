package com.smsone.dao;

import java.util.List;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;


public interface HouseDAO {
	public void saveHouse(House house,Long oId);
	public void updateHouse(House house);
	public void deleteHouse(House house);
	public List<House> remainingOwnerHouse(Long oId);
	public List<Room> getRooms(House house);
	public List<House> list(Integer offset, Integer maxResults);
	

	public List<House> listHouseByFilters(House house,Integer offset, Integer maxResults);
	public Long count();
	public House getHouse(House house);
	public boolean checkAadharNumber(House house);
	public Long countByFilter(House house);
	public Long countAllFilter(House house);
	
	public void saveBed(Beds beds,Long rid);
	//new work
	public List<House> listHouseByAddressLongTerm(House house,Integer offset, Integer maxResults);
	public Long countHouseByAddressLongTerm(House house);
	public List<House> listHouseByAddressShortTerm(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByMainFilter(House house,User user,Integer offset, Integer maxResults);
	public List<House> listHouseByadvancedFilter(House house,User user,String[] facilities,Integer offset, Integer maxResults);
	public Long listHouseByadvancedFilterCount(House house,User user,String[] facilities);
	public Long listHouseByMainFilterCount(House house,User user);
}
