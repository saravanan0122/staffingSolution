package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
	private UUID zoneId;
	private String zoneName;
	private String zoneCode;
	private String address;
	private String email;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private String zoneManagerId;
	private int zoneManager;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationId")
	private OrganizationEntity organizationId;

	


	
	
	

	

}
