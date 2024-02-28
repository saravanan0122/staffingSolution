package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	private UUID departmentId;
	private String departmentName;
	private String departmentCode;
	private String email;
	private String departmentHead;
	private String departmentHeadId;
	private int phoneNumber;
	
	@OneToOne
	@JoinColumn(name = "branchId")
	private BranchEntity branchId;

	
	

	

}
