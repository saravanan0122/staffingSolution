package com.justkolorz.ms.staff.model;

import java.util.UUID;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Organization{


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
		return "Organization [organizationId=" + organizationId + ", organizationName=" + organizationName
				+ ", organizationCode=" + organizationCode + ", address=" + address + ", industry=" + industry
				+ ", email=" + email + ", website=" + website + ", landlineNumber=" + landlineNumber + ", faxNumber="
				+ faxNumber + ", phoneNumber=" + phoneNumber + ", foundedYear=" + foundedYear + "]";
	}
	

	

}
