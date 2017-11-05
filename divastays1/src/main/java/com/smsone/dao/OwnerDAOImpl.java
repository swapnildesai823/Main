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
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Repository;

import com.smsone.model.Owner;
import com.smsone.model.User;
@Repository
public class OwnerDAOImpl implements OwnerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	//save owner
	public void saveOwner(Owner owner) {
		Session session=sessionFactory.openSession();
		session.save(owner);
		session.close();
	}
	public boolean checkContactNumber(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("contactNumber",owner.getContactNumber());
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
	public boolean checkAadharNumber(Owner owner) {
			Session session=sessionFactory.openSession();
			Criteria crit=session.createCriteria(Owner.class);
			Criterion c1=Restrictions.eq("aadharNumber",owner.getAadharNumber());
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
    public boolean checkEmail(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
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
	public Owner checkOwnerLogin(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
		Criterion c2=Restrictions.eq("password",owner.getPassword());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<Owner> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			owner=(Owner)list.get(0);
		return owner;
		}		
	}
	public Owner verifyOwnerAccount(Owner owner) {
		Date date=new Date(); 
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
		Criterion c2=Restrictions.eq("ownerHashcode",owner.getOwnerHashcode());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<Owner> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			owner=(Owner)list.get(0);
			Date ownerDate=owner.getOwnerCreation_date();
			long duration=date.getTime()-ownerDate.getTime();
			Transaction tx=session.beginTransaction();
			String status=owner.getOwnerStatus();
			if(status==null)
			{
				if(duration>60000)
			   {
					owner.setOwnerStatus("Expired");
			   }
			   else
			   {
				   owner.setOwnerStatus("Activated");
			   }
			}
			else if(status.equals("Activated"))
			{	
			}
			else
			{
				owner.setOwnerStatus("Expired");
			}
			session.save(owner);
			tx.commit();
			session.close();
			return owner;
		}
	}
	public Owner sendNewLink(Owner owner) {
		Date date=new Date();
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Owner> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			Owner owner1=(Owner)list.get(0);
			Transaction tx=session.beginTransaction();
			if(owner.getEmailResendTime()!=null)
			{
				owner1.setOwnerHashcode(owner.getOwnerHashcode());
				owner1.setEmailResendTime(owner.getEmailResendTime());
			}
			else
			{
				Date emailResendDate=owner1.getEmailResendTime();
				long duration=date.getTime()-emailResendDate.getTime();

				if(duration>60000)
				{
					owner1.setOwnerStatus("Expired");
				}
				else
				{
					owner1.setOwnerStatus("Activated");
				}
			}	
			session.save(owner1);
			tx.commit();
			session.close();
			return owner1;
		}
	}
	public Owner getOwner(Owner owner) {
		Session session=sessionFactory.openSession();
		Owner owner1=(Owner)session.load(Owner.class,owner.getoId());
		return owner1;
	}
	public void updateOwner(Owner owner) {
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(owner);
		tx.commit();
	    session.close();		
	}
}

