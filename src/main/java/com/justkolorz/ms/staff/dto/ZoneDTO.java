package com.justkolorz.ms.staff.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ZoneDTO {
	
	private String zoneId;
	private String zoneName;
	private String zoneCode;
	private String address;
	private String email;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private String zoneManagerCode;
	private String zoneManager;
	private String organizationId;
	
	
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneCode() {
		return zoneCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
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
	
	public String getZoneManagerCode() {
		return zoneManagerCode;
	}
	public void setZoneManagerCode(String zoneManagerCode) {
		this.zoneManagerCode = zoneManagerCode;
	}
	public String getZoneManager() {
		return zoneManager;
	}
	public void setZoneManager(String zoneManager) {
		this.zoneManager = zoneManager;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	
}
