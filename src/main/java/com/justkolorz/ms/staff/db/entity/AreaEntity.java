package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name="area", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class AreaEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	private UUID areaId;
	private String areaName;
	private String areaCode;
	private String address;
	private String email;
	private int landlineNumber;
	private int faxNumber;
	private int phoneNumber;
	private String areaManagerId;
	private int areaManager;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "zoneId")
	private ZoneEntity zoneId;


}
