package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	

}
