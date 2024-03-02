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
@Table(name="zone", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class ZoneEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(generator ="uuid2")
	@UuidGenerator(style = Style.AUTO)
	private UUID zoneId;
	private String zoneName;
	private String zoneCode;
	private String address;
	private String email;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private String zoneManagerCode;
	private String zoneManager;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationId")
	private OrganizationEntity organizationId;
		
	
	public UUID getZoneId() {
		return zoneId;
	}
	public void setZoneId(UUID zoneId) {
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
	public OrganizationEntity getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(OrganizationEntity organizationId) {
		this.organizationId = organizationId;
	}
	
	
	
	
	
	

	

}
