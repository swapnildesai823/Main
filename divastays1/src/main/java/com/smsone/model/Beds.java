package com.smsone.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table
public class Beds implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bId;
	private Long bedId;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uId")
	private User user;
	@ManyToOne
    @JoinColumn(name = "rId")
	private Room room;
	@Temporal(TemporalType.DATE)
	private Date checkIn ;
	@Temporal(TemporalType.DATE)
	private Date checkOut ;
	public Long getbId() {
		return bId;
	}
	public void setbId(Long bId) {
		this.bId = bId;
	}
	public Long getBedId() {
		return bedId;
	}
	public void setBedId(Long bedId) {
		this.bedId = bedId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Beds() {
		super();
	}
	public Beds(Long bId, Long bedId, User user, Room room, Date checkIn, Date checkOut) {
		super();
		this.bId = bId;
		this.bedId = bedId;
		this.user = user;
		this.room = room;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Beds [bId=" + bId + ", bedId=" + bedId + ", user=" + user + ", room=" + room + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bId == null) ? 0 : bId.hashCode());
		result = prime * result + ((bedId == null) ? 0 : bedId.hashCode());
		result = prime * result + ((checkIn == null) ? 0 : checkIn.hashCode());
		result = prime * result + ((checkOut == null) ? 0 : checkOut.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Beds other = (Beds) obj;
		if (bId == null) {
			if (other.bId != null)
				return false;
		} else if (!bId.equals(other.bId))
			return false;
		if (bedId == null) {
			if (other.bedId != null)
				return false;
		} else if (!bedId.equals(other.bedId))
			return false;
		if (checkIn == null) {
			if (other.checkIn != null)
				return false;
		} else if (!checkIn.equals(other.checkIn))
			return false;
		if (checkOut == null) {
			if (other.checkOut != null)
				return false;
		} else if (!checkOut.equals(other.checkOut))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
	
}
