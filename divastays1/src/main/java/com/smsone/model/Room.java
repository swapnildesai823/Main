package com.smsone.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long rId;
	private Long roomId;
	private String roomtype;
	private String ac;
	private String wifi;
	private String bathroom;
	private String geyser;
	private String bed;
	private String swimmingPool;
	private String gym;
	private Integer numberOfBed;
	private String foodAvailability;
	
	@Column(name="img1",columnDefinition = "LONGBLOB")
	private byte[] img1;
	@Column(name="img2",columnDefinition = "LONGBLOB")
	private byte[] img2;
	@Column(name="img3",columnDefinition = "LONGBLOB")
	private byte[] img3;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "hId")
	private House house;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="room")
	private List<Beds> Beds;
	public Long getrId() {
		return rId;
	}
	public void setrId(Long rId) {
		this.rId = rId;
	}
	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getBathroom() {
		return bathroom;
	}
	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}
	public String getGeyser() {
		return geyser;
	}
	public void setGeyser(String geyser) {
		this.geyser = geyser;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public String getSwimmingPool() {
		return swimmingPool;
	}
	public void setSwimmingPool(String swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	public String getGym() {
		return gym;
	}
	public void setGym(String gym) {
		this.gym = gym;
	}
	public Integer getNumberOfBed() {
		return numberOfBed;
	}
	public void setNumberOfBed(Integer numberOfBed) {
		this.numberOfBed = numberOfBed;
	}
	public String getFoodAvailability() {
		return foodAvailability;
	}
	public void setFoodAvailability(String foodAvailability) {
		this.foodAvailability = foodAvailability;
	}
	public byte[] getImg1() {
		return img1;
	}
	public void setImg1(byte[] img1) {
		this.img1 = img1;
	}
	public byte[] getImg2() {
		return img2;
	}
	public void setImg2(byte[] img2) {
		this.img2 = img2;
	}
	public byte[] getImg3() {
		return img3;
	}
	public void setImg3(byte[] img3) {
		this.img3 = img3;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public List<Beds> getBeds() {
		return Beds;
	}
	public void setBeds(List<Beds> beds) {
		Beds = beds;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Room() {
		super();
	}
	public Room(Long rId, Long roomId, String roomtype, String ac, String wifi, String bathroom, String geyser,
			String bed, String swimmingPool, String gym, Integer numberOfBed, String foodAvailability, byte[] img1,
			byte[] img2, byte[] img3, House house, List<com.smsone.model.Beds> beds) {
		super();
		this.rId = rId;
		this.roomId = roomId;
		this.roomtype = roomtype;
		this.ac = ac;
		this.wifi = wifi;
		this.bathroom = bathroom;
		this.geyser = geyser;
		this.bed = bed;
		this.swimmingPool = swimmingPool;
		this.gym = gym;
		this.numberOfBed = numberOfBed;
		this.foodAvailability = foodAvailability;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.house = house;
		Beds = beds;
	}
	@Override
	public String toString() {
		return "Room [rId=" + rId + ", roomId=" + roomId + ", roomtype=" + roomtype + ", ac=" + ac + ", wifi=" + wifi
				+ ", bathroom=" + bathroom + ", geyser=" + geyser + ", bed=" + bed + ", swimmingPool=" + swimmingPool
				+ ", gym=" + gym + ", numberOfBed=" + numberOfBed + ", foodAvailability=" + foodAvailability + ", img1="
				+ Arrays.toString(img1) + ", img2=" + Arrays.toString(img2) + ", img3=" + Arrays.toString(img3)
				+ ", house=" + house + ", Beds=" + Beds + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Beds == null) ? 0 : Beds.hashCode());
		result = prime * result + ((ac == null) ? 0 : ac.hashCode());
		result = prime * result + ((bathroom == null) ? 0 : bathroom.hashCode());
		result = prime * result + ((bed == null) ? 0 : bed.hashCode());
		result = prime * result + ((foodAvailability == null) ? 0 : foodAvailability.hashCode());
		result = prime * result + ((geyser == null) ? 0 : geyser.hashCode());
		result = prime * result + ((gym == null) ? 0 : gym.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + Arrays.hashCode(img1);
		result = prime * result + Arrays.hashCode(img2);
		result = prime * result + Arrays.hashCode(img3);
		result = prime * result + ((numberOfBed == null) ? 0 : numberOfBed.hashCode());
		result = prime * result + ((rId == null) ? 0 : rId.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((roomtype == null) ? 0 : roomtype.hashCode());
		result = prime * result + ((swimmingPool == null) ? 0 : swimmingPool.hashCode());
		result = prime * result + ((wifi == null) ? 0 : wifi.hashCode());
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
		Room other = (Room) obj;
		if (Beds == null) {
			if (other.Beds != null)
				return false;
		} else if (!Beds.equals(other.Beds))
			return false;
		if (ac == null) {
			if (other.ac != null)
				return false;
		} else if (!ac.equals(other.ac))
			return false;
		if (bathroom == null) {
			if (other.bathroom != null)
				return false;
		} else if (!bathroom.equals(other.bathroom))
			return false;
		if (bed == null) {
			if (other.bed != null)
				return false;
		} else if (!bed.equals(other.bed))
			return false;
		if (foodAvailability == null) {
			if (other.foodAvailability != null)
				return false;
		} else if (!foodAvailability.equals(other.foodAvailability))
			return false;
		if (geyser == null) {
			if (other.geyser != null)
				return false;
		} else if (!geyser.equals(other.geyser))
			return false;
		if (gym == null) {
			if (other.gym != null)
				return false;
		} else if (!gym.equals(other.gym))
			return false;
		if (house == null) {
			if (other.house != null)
				return false;
		} else if (!house.equals(other.house))
			return false;
		if (!Arrays.equals(img1, other.img1))
			return false;
		if (!Arrays.equals(img2, other.img2))
			return false;
		if (!Arrays.equals(img3, other.img3))
			return false;
		if (numberOfBed == null) {
			if (other.numberOfBed != null)
				return false;
		} else if (!numberOfBed.equals(other.numberOfBed))
			return false;
		if (rId == null) {
			if (other.rId != null)
				return false;
		} else if (!rId.equals(other.rId))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (roomtype == null) {
			if (other.roomtype != null)
				return false;
		} else if (!roomtype.equals(other.roomtype))
			return false;
		if (swimmingPool == null) {
			if (other.swimmingPool != null)
				return false;
		} else if (!swimmingPool.equals(other.swimmingPool))
			return false;
		if (wifi == null) {
			if (other.wifi != null)
				return false;
		} else if (!wifi.equals(other.wifi))
			return false;
		return true;
	}

	
	
}
