package com.smsone.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.House;
import com.smsone.model.User;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	//save user
	public void saveUser(User user) {
		Session session=sessionFactory.openSession();
		session.save(user);
		session.close();
	}
	@SuppressWarnings("unchecked")
	public boolean checkEmail(User user) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		crit.add(c1);
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean checkContactNumber(User user) {

		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("contactNumber",user.getContactNumber());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean checkAadharNumber(User user) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("aadharNumber",user.getAadharNumber());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public User checkLogin(User user) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		Criterion c2=Restrictions.eq("password",user.getPassword());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			user=(User)list.get(0);
			return user;
		}

	}
	
	public User verifyUserAccount(User user) {
		Date date=new Date(); 
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		Criterion c2=Restrictions.eq("hashcode",user.getHashcode());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			user=(User)list.get(0);
			Date userDate=user.getUserCreation_date();
			long duration=date.getTime()-userDate.getTime();
			Transaction tx=session.beginTransaction();
			String status=user.getStatus();
			if(status==null)
			{
				if(duration>60000)
			   {
				user.setStatus("Expired");
			   }
			   else
			   {
				user.setStatus("Activated");
			   }
			}
			else if(status.equals("Activated"))
			{
				
			}
			else
			{
				user.setStatus("Expired");
			}
			session.save(user);
			tx.commit();
			session.close();
			return user;
		}
	}

	public User sendNewLink(User user) {
		Date date=new Date();
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			User user1=(User)list.get(0);
			Transaction tx=session.beginTransaction();
			if(user.getEmailResendTime()!=null)
			{

				user1.setHashcode(user.getHashcode());
				user1.setEmailResendTime(user.getEmailResendTime());
			}
			else
			{
				Date emailResendDate=user1.getEmailResendTime();
				long duration=date.getTime()-emailResendDate.getTime();

				if(duration>1200000)
				{
					user1.setStatus("Expired");
				}
				else
				{
					user1.setStatus("Activated");
				}
			}	
			session.save(user1);
			tx.commit();
			session.close();
			return user1;
		}
	}
	public User getUser(User user) {
		Session session=sessionFactory.openSession();
		User user1=(User)session.load(User.class,user.getuId());
		return user1;
		
	}
	public void updateUser(User user) {
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(user);
		tx.commit();
	    session.close();		
		
	}

}
