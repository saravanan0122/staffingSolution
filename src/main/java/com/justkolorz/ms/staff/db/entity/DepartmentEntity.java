package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="department", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class DepartmentEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(generator ="uuid2")
	@UuidGenerator(style = Style.AUTO)
	private UUID departmentId;
	private String departmentName;
	private String departmentCode;
	private String email;
	private String departmentHead;
	private String departmentHeadId;
	private String phoneNumber;
	private UUID branchId;
	
	public UUID getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(UUID departmentId) {
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
	public UUID getBranchId() {
		return branchId;
	}
	public void setBranchId(UUID branchId) {
		this.branchId = branchId;
	}
	

}
