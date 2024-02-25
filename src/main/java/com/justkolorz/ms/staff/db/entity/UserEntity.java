package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="user", schema = "staafing_service_dev")
@Data
@EqualsAndHashCode
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id	
	private UUID userId;
	private String userName;
	private String userCode;
	private String email;
	private Integer mobileNumber;
	private LocalDate joiningDate;
	private String address;
	private LocalDate birthDate;
	private String gender;
	private UUID branchId;
	private UUID departmentId;
	private UUID organizationId;

	
	
	

	

	

}
