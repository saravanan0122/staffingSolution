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
@Table(name="organization", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class OrganizationEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(generator ="uuid2")
	@UuidGenerator(style = Style.AUTO)
	private UUID organizationId;
	private String organizationName;
	private String organizationCode;
	private String address;
	private String industry;
	private String email;
	private String website;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private int foundedYear;
	@Override
	public String toString() {
		return "OrganizationEntity [organizationId=" + organizationId + ", organizationName=" + organizationName
				+ ", organizationCode=" + organizationCode + ", address=" + address + ", industry=" + industry
				+ ", email=" + email + ", website=" + website + ", landlineNumber=" + landlineNumber + ", faxNumber="
				+ faxNumber + ", phoneNumber=" + phoneNumber + ", foundedYear=" + foundedYear + "]";
	}
	public UUID getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(UUID organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
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
	public int getFoundedYear() {
		return foundedYear;
	}
	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}	
	
	
}
