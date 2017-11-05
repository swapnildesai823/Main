package com.smsone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.HouseDAO;
import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;

@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	HouseDAO houseDAO;
	public void saveHouse(House house,Long oId)
   	{
		houseDAO.saveHouse(house,oId);
	}
	public List<House> list(Integer offset, Integer maxResults) {
		return houseDAO.list(offset, maxResults);
	}
	public Long count() {
		return houseDAO.count();
	}
	public House getHouse(House house) {
		return houseDAO.getHouse(house);
	}
	public List<House> listHouseByAddressLongTerm(House house, Integer offset, Integer maxResults) {
		return houseDAO.listHouseByAddressLongTerm(house,offset, maxResults);
	}
	public boolean checkAadharNumber(House house) {
		return houseDAO.checkAadharNumber(house);
	}
	public List<House> listHouseByMainFilter(House house,User user,Integer offset, Integer maxResults) {
		return houseDAO.listHouseByMainFilter(house,user, offset, maxResults);
	}
	public Long countByFilter(House house) {
		return houseDAO.countByFilter(house);
	}
	public List<House> listHouseByFilters(House house, Integer offset, Integer maxResults) {
		return houseDAO.listHouseByFilters(house, offset, maxResults);
	}
	public List<House> listHouseByadvancedFilter(House house,User user,String[] facilities,Integer offset, Integer maxResults) {
		return houseDAO.listHouseByadvancedFilter(house,user,facilities,maxResults,offset);
	}
	public void saveBed(Beds beds,Long rid) {
		houseDAO.saveBed(beds,rid);
		
	}
	public void updateHouse(House house) {
		houseDAO.updateHouse(house);
		
	}
	public void deleteHouse(House house) {
		houseDAO.deleteHouse(house);
		
	}
	public List<House> remainingOwnerHouse(Long oId) {
		return houseDAO.remainingOwnerHouse(oId);
	}
	public List<Room> getRooms(House house) {
		return houseDAO.getRooms(house);
	}
	
	public Long countHouseByAddressLongTerm(House house) {
		return houseDAO.countHouseByAddressLongTerm(house);
	}
	public List<House> listHouseByAddressShortTerm(House house, Integer offset, Integer maxResults) {
		return houseDAO.listHouseByAddressShortTerm(house, offset, maxResults);
	}
	public Long listHouseByadvancedFilterCount(House house, User user, String[] facilities) {
		return houseDAO.listHouseByadvancedFilterCount(house, user, facilities);
	}
	public Long listHouseByMainFilterCount(House house, User user) {
		return houseDAO.listHouseByMainFilterCount(house, user);
}
}
