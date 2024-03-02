package com.justkolorz.ms.staff.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class AreaDTO {

	private String areaId;
	private String areaName;
	private String areaCode;
	private String address;
	private String email;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private String areaManagerId;
	private String areaManager;
	private String zoneId;
	
	

	@Override
	public String toString() {
		return "AreaDTO [areaId=" + areaId + ", areaName=" + areaName + ", areaCode=" + areaCode + ", address="
				+ address + ", email=" + email + ", landlineNumber=" + landlineNumber + ", faxNumber=" + faxNumber
				+ ", phoneNumber=" + phoneNumber + ", areaManagerId=" + areaManagerId + ", areaManager=" + areaManager
				+ ", zoneId=" + zoneId + "]";
	}
	
	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
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
	public String getAreaManager() {
		return areaManager;
	}
	public void setAreaManager(String areaManager) {
		this.areaManager = areaManager;
	}
	
	
	
	
}
