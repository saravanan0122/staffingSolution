package com.justkolorz.ms.staff.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class BranchDTO {
	
	private String branchName;
	private String branchCode;
	private String address;
	private String branchType;
	private String email;
	private String branchManagerId;
	private String branchManager;
	private String landlineNumber;
	private String faxNumber;
	private String phoneNumber;
	private String branchId;
	private String areaId;
	private String zoneId;
	private String departmentId;
	
	@Override
	public String toString() {
		return "BranchDTO [branchName=" + branchName + ", branchCode=" + branchCode + ", address=" + address
				+ ", branchType=" + branchType + ", email=" + email + ", branchManagerId=" + branchManagerId
				+ ", branchManager=" + branchManager + ", landlineNumber=" + landlineNumber + ", faxNumber=" + faxNumber
				+ ", phoneNumber=" + phoneNumber + ", branchId=" + branchId + ", areaId=" + areaId + ", zoneId="
				+ zoneId + ", departmentId=" + departmentId + "]";
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranchManagerId() {
		return branchManagerId;
	}

	public void setBranchManagerId(String branchManagerId) {
		this.branchManagerId = branchManagerId;
	}

	public String getBranchManager() {
		return branchManager;
	}

	public void setBranchManager(String branchManager) {
		this.branchManager = branchManager;
	}

	public String getLandlineNumber() {
		return landlineNumber;
	}

	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	

}
