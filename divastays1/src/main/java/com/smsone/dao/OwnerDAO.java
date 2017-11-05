package com.smsone.dao;

import com.smsone.model.Owner;


public interface OwnerDAO {
	public void saveOwner(Owner owner);
	public void updateOwner(Owner owner);
	public boolean checkContactNumber(Owner owner);
	public boolean checkAadharNumber(Owner owner);
	public boolean checkEmail(Owner owner);
	public Owner checkOwnerLogin(Owner owner);
	public Owner verifyOwnerAccount(Owner owner);
	public Owner sendNewLink(Owner owner);
	public Owner getOwner(Owner owner);
}
