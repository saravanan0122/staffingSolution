package com.justkolorz.ms.staff.db.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.justkolorz.ms.staff.db.entity.ZoneEntity;

@Repository
public interface ZoneRepository extends JpaRepository<ZoneEntity , UUID> {
	


}
