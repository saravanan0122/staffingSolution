package com.justkolorz.ms.staff.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class OrganizationDTO implements Serializable{

	private static final long serialVersionUID = 1L;
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
		return "OrganizationDTO [organizationName=" + organizationName + ", organizationCode=" + organizationCode
				+ ", address=" + address + ", industry=" + industry + ", email=" + email + ", website=" + website
				+ ", landlineNumber=" + landlineNumber + ", faxNumber=" + faxNumber + ", phoneNumber=" + phoneNumber
				+ ", foundedYear=" + foundedYear + "]";
	}

	

}
