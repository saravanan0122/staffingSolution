package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="area", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class AreaEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(generator ="uuid2")
	@UuidGenerator(style = Style.AUTO)
	private UUID areaId;
	private String areaName;
	private String areaCode;
	private String address;
	private String email;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private String areaManagerId;
	private int areaManager;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "zoneId")
	private ZoneEntity zoneId;

	public UUID getAreaId() {
		return areaId;
	}

	public void setAreaId(UUID areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLandlineNumber() {
		return landlineNumber;
	}

	public void setLandlineNumber(int landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	public int getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(int faxNumber) {
		this.faxNumber = faxNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAreaManagerId() {
		return areaManagerId;
	}

	public void setAreaManagerId(String areaManagerId) {
		this.areaManagerId = areaManagerId;
	}

	public int getAreaManager() {
		return areaManager;
	}

	public void setAreaManager(int areaManager) {
		this.areaManager = areaManager;
	}

	public ZoneEntity getZoneId() {
		return zoneId;
	}

	public void setZoneId(ZoneEntity zoneId) {
		this.zoneId = zoneId;
	}

	

}
