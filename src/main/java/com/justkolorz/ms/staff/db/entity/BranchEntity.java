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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="branch", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class BranchEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(generator ="uuid2")
	@UuidGenerator(style = Style.AUTO)
	private UUID branchId;
	private String branchName;
	private String branchCode;
	private String address;
	private String branchType;
	private String email;
	private String branchManagerId;
	private String branchManager;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "areaId")
	private AreaEntity areaId;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "zoneId")
	private ZoneEntity zoneId;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "departmentId")
	private DepartmentEntity departmentId;

	public UUID getBranchId() {
		return branchId;
	}

	public void setBranchId(UUID branchId) {
		this.branchId = branchId;
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

	public AreaEntity getAreaId() {
		return areaId;
	}

	public void setAreaId(AreaEntity areaId) {
		this.areaId = areaId;
	}

	public ZoneEntity getZoneId() {
		return zoneId;
	}

	public void setZoneId(ZoneEntity zoneId) {
		this.zoneId = zoneId;
	}

	public DepartmentEntity getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DepartmentEntity departmentId) {
		this.departmentId = departmentId;
	}

}
