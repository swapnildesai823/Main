package com.smsone.service;

import java.util.Date;
import java.util.List;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;

public interface RoomService {
	public void saveRoom(Room room,Long hId);
	public void assignBed(User user,Beds beds);
	public List<Room> getAllRoomDetails(Long hId);
	public Long countRooms(Long hId);
	public Long countBeds(Long rId);
	
	public User getUser(Long bId);
	public Room getRoom(Room room);
	public void updateRoom(Room room);
	public List<User> getUsers(List<Beds> beds);
	public Room getRoom(Long rId);
	public List<Beds> getAllBedDetails(Long rId);
	
	
	
	



}
