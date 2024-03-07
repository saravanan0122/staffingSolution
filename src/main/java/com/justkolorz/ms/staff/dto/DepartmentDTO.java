package com.justkolorz.ms.staff.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class DepartmentDTO {

	private String departmentId;
	private String departmentName;
	private String departmentCode;
	private String email;
	private String departmentHead;
	private String departmentHeadId;
	private String phoneNumber;
	private String branchId;
	@Override
	public String toString() {
		return "DepartmentDTO [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentCode=" + departmentCode + ", email=" + email + ", departmentHead=" + departmentHead
				+ ", departmentHeadId=" + departmentHeadId + ", phoneNumber=" + phoneNumber + ", branchId=" + branchId
				+ "]";
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	public String getDepartmentHeadId() {
		return departmentHeadId;
	}
	public void setDepartmentHeadId(String departmentHeadId) {
		this.departmentHeadId = departmentHeadId;
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
	
}
