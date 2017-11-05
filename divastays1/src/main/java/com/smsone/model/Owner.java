package com.smsone.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Owner implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,unique = true)
	private Long oId;
	@Column(nullable=false,length=20)
	private String firstName;
	@Column(nullable=false,length=20)
	private String lastName;
	@Column(nullable=false,length=30)
	private String email;
	@Column(nullable=false,length=12,unique = true)
	private Long aadharNumber;
	@Column(nullable=false,length=10)
	private Long contactNumber;
	@Column(nullable=false,length=20)
	private String password;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="owner")
	private List<House> house;
	@Column(nullable=false,length=50)
	private String ownerHashcode;
	@Column(length=20)
	private Long attempts;
	@Column(length=20)
	private String ownerStatus;
	@Column(name="CREATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ownerCreation_date;
	@Column(name="Email_ResendTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date emailResendTime;
	public Long getoId() {
		return oId;
	}
	public void setoId(Long oId) {
		this.oId = oId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<House> getHouse() {
		return house;
	}
	public void setHouse(List<House> house) {
		this.house = house;
	}
	public String getOwnerHashcode() {
		return ownerHashcode;
	}
	public void setOwnerHashcode(String ownerHashcode) {
		this.ownerHashcode = ownerHashcode;
	}
	public Long getAttempts() {
		return attempts;
	}
	public void setAttempts(Long attempts) {
		this.attempts = attempts;
	}
	public String getOwnerStatus() {
		return ownerStatus;
	}
	public void setOwnerStatus(String ownerStatus) {
		this.ownerStatus = ownerStatus;
	}
	public Date getOwnerCreation_date() {
		return ownerCreation_date;
	}
	public void setOwnerCreation_date(Date ownerCreation_date) {
		this.ownerCreation_date = ownerCreation_date;
	}
	public Date getEmailResendTime() {
		return emailResendTime;
	}
	public void setEmailResendTime(Date emailResendTime) {
		this.emailResendTime = emailResendTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Owner() {
		super();
	}
	public Owner(Long oId, String firstName, String lastName, String email, Long aadharNumber, Long contactNumber,
			String password, List<House> house, String ownerHashcode, Long attempts, String ownerStatus,
			Date ownerCreation_date, Date emailResendTime) {
		super();
		this.oId = oId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.aadharNumber = aadharNumber;
		this.contactNumber = contactNumber;
		this.password = password;
		this.house = house;
		this.ownerHashcode = ownerHashcode;
		this.attempts = attempts;
		this.ownerStatus = ownerStatus;
		this.ownerCreation_date = ownerCreation_date;
		this.emailResendTime = emailResendTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharNumber == null) ? 0 : aadharNumber.hashCode());
		result = prime * result + ((attempts == null) ? 0 : attempts.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emailResendTime == null) ? 0 : emailResendTime.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((oId == null) ? 0 : oId.hashCode());
		result = prime * result + ((ownerCreation_date == null) ? 0 : ownerCreation_date.hashCode());
		result = prime * result + ((ownerHashcode == null) ? 0 : ownerHashcode.hashCode());
		result = prime * result + ((ownerStatus == null) ? 0 : ownerStatus.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (aadharNumber == null) {
			if (other.aadharNumber != null)
				return false;
		} else if (!aadharNumber.equals(other.aadharNumber))
			return false;
		if (attempts == null) {
			if (other.attempts != null)
				return false;
		} else if (!attempts.equals(other.attempts))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emailResendTime == null) {
			if (other.emailResendTime != null)
				return false;
		} else if (!emailResendTime.equals(other.emailResendTime))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (house == null) {
			if (other.house != null)
				return false;
		} else if (!house.equals(other.house))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (oId == null) {
			if (other.oId != null)
				return false;
		} else if (!oId.equals(other.oId))
			return false;
		if (ownerCreation_date == null) {
			if (other.ownerCreation_date != null)
				return false;
		} else if (!ownerCreation_date.equals(other.ownerCreation_date))
			return false;
		if (ownerHashcode == null) {
			if (other.ownerHashcode != null)
				return false;
		} else if (!ownerHashcode.equals(other.ownerHashcode))
			return false;
		if (ownerStatus == null) {
			if (other.ownerStatus != null)
				return false;
		} else if (!ownerStatus.equals(other.ownerStatus))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Owner [oId=" + oId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", aadharNumber=" + aadharNumber + ", contactNumber=" + contactNumber + ", password=" + password
				+ ", house=" + house + ", ownerHashcode=" + ownerHashcode + ", attempts=" + attempts + ", ownerStatus="
				+ ownerStatus + ", ownerCreation_date=" + ownerCreation_date + ", emailResendTime=" + emailResendTime
				+ "]";
	}
	
	
}