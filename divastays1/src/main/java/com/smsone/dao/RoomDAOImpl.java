package com.smsone.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.criterion.ProjectionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;
@Repository
public class RoomDAOImpl implements RoomDAO {
	@Autowired
	private SessionFactory sessionFactory;
	//save room
	public void saveRoom(Room room,Long hId) {
		Session session=sessionFactory.openSession();
		House house=(House)session.load(House.class,hId);
		room.setHouse(house);
		session.save(room);
		for(int i=1;i<=room.getNumberOfBed();i++)
		{
			Beds beds=new Beds();
			beds.setBedId(new Long(i));
			Room room1=(Room)session.load(Room.class,room.getrId());
			Date date=new Date();
			beds.setCheckIn(date);
			beds.setRoom(room1);
			session.save(beds);
		}
		session.close();
	}
	public void assignBed(User user, Beds beds) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		User user1=(User)session.get(User.class,user.getuId());
		Beds beds1=(Beds)session.get(Beds.class,beds.getbId());
		Room room=beds1.getRoom();
		House house=room.getHouse();
		user1.setHouse(house);
		session.save(user1);
		beds1.setUser(user1);
		session.save(beds1);
		tx.commit();
		session.close();
	}
	@SuppressWarnings("unchecked")
	public List<Beds> getAllBedDetails(Long rId) {
		Session session=sessionFactory.openSession();	
		//Query query=session.createQuery("select beds.bId from Beds beds where beds.room=:rId"); 
		//query.setLong("rId", rId);
		Criteria crit = session.createCriteria(Beds.class);
	    ProjectionList projList = Projections.projectionList();
	    projList.add(Projections.property("Id"));
	    projList.add(Projections.property("name"));
	    crit.setProjection(projList);
		List<Object[]> beds = crit.list();
		
		return null;
	}
	public List<Room> getAllRoomDetails(Long hId) {
		Session session=sessionFactory.openSession();
		House house=(House)session.load(House.class,hId);
		List<Room> room=house.getRooms();
		if(room!=null)
		{
		return room;
		}
		else
		{
			return null;
		}
	}
	
	public Long countRooms(Long hId) {
		Session session=sessionFactory.openSession();
		House house=(House)session.load(House.class, hId);
		List<Room> room=house.getRooms();
		int count=room.size();
		Long c=new Long(count);
		session.close();
		return c;
	}
	public Long countBeds(Long rId) {
		Session session=sessionFactory.openSession();
		Room room=(Room)session.load(Room.class, rId);
		List<Beds> beds=room.getBeds();
		int count=beds.size();
		Long bedCount=new Long(count);
		session.close();
		return bedCount;
	}
	@SuppressWarnings("unchecked")
	public List<User> getUsers(List<Beds> beds) {
		Session session=sessionFactory.openSession();

		return null;
	}
	public Room getRoom(Room room) {
		Session session=sessionFactory.openSession();
		Criteria cr = session.createCriteria(Room.class)
			    .setProjection(Projections.projectionList()
			      .add(Projections.property("rId"), "rId")
			      .add(Projections.property("roomtype"), "roomtype")
			      .add(Projections.property("ac"), "ac")
			      .add(Projections.property("wifi"), "wifi")
			      .add(Projections.property("bathroom"), "bathroom")
			      .add(Projections.property("geyser"), "geyser")
			      .add(Projections.property("bed"), "bed")
			      .add(Projections.property("swimmingPool"), "swimmingPool")
			      .add(Projections.property("gym"), "gym")
			      .add(Projections.property("numberOfBed"), "numberOfBed")
			      .add(Projections.property("foodAvailability"), "foodAvailability")
			      .add(Projections.property("img1"), "img1")
			      .add(Projections.property("img2"), "img2")
			      .add(Projections.property("img3"), "img3"))
			    .setResultTransformer(new AliasToBeanResultTransformer(Room.class));
		cr.add(Restrictions.eq("rId",room.getrId()));
		List room1=cr.list();
		return (Room) room1;
		
		

	}

	public void updateRoom(Room room) {
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(room);
		tx.commit();
	    session.close();		 		
	}	
	public Room getRoom(Long rId) {
		Session session=sessionFactory.openSession();
		Room room=(Room)session.load(Room.class,rId);
		return room;
	}
	public User getUser(Long bId) {
		// TODO Auto-generated method stub
		return null;
	}

}
