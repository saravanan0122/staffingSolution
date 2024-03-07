package com.justkolorz.ms.staff.db.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.justkolorz.ms.staff.db.entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, UUID> {

	DepartmentEntity findByDepartmentId(UUID departmentId);

}
