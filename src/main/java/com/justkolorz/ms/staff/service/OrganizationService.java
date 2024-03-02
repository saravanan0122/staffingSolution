package com.justkolorz.ms.staff.service;

import org.springframework.stereotype.Service;

import com.justkolorz.ms.staff.db.entity.OrganizationEntity;
import com.justkolorz.ms.staff.dto.OrganizationDTO;

@Service
public interface OrganizationService {

	public OrganizationDTO saveOrganization(OrganizationEntity organizationEntity);
}
