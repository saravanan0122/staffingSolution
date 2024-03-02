package com.justkolorz.ms.staff.db.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.justkolorz.ms.staff.db.entity.BranchEntity;

@Repository
public interface BranchRepository extends JpaRepository<BranchEntity , UUID> {

	BranchEntity findByBranchId(UUID branchId);
	


}
