package com.justkolorz.ms.staff.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;


@MappedSuperclass
@Data
@EqualsAndHashCode
public class AuditEntiy implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Column(name="created_by")
	@CreatedBy
	private String createdBy;
	
	@Column(name="lastmodified_by")
	@LastModifiedBy
	private String lastModifiedBy;

	@Column(name="created_date")
	@CreatedDate
	private LocalDateTime createdDate;
	
	@Column(name="lastmodified_date")
	@LastModifiedDate
	private LocalDateTime lastModifiedDate;

	@Version
	@Column(name="version")
	private int version;
	
	@PrePersist
	public void preCreate() {
		createdDate = LocalDateTime.now();
		createdBy = "SYSTEM";
	}
	
	@PreUpdate
	public void preUpdate() {
		lastModifiedDate = LocalDateTime.now();
		lastModifiedBy = "SYSTEM";
	}

	@Override
	public String toString() {
		return "AuditEntiy [createdBy=" + createdBy + ", lastModifiedBy=" + lastModifiedBy + ", createdDate="
				+ createdDate + ", lastModifiedDate=" + lastModifiedDate + ", version=" + version + "]";
	}
	
	
	
	

}
