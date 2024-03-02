package com.justkolorz.ms.staff.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.justkolorz.ms.staff.db.entity.OrganizationEntity;
import com.justkolorz.ms.staff.db.repository.OrganizationRepository;
import com.justkolorz.ms.staff.dto.OrganizationDTO;
import com.justkolorz.ms.staff.service.OrganizationService;


public class OrganizationServiceImpl implements OrganizationService{

	 Logger log = LoggerFactory.getLogger(OrganizationServiceImpl.class);
	 
	@Autowired
	OrganizationRepository organizationRepository;


	@Override
	public OrganizationDTO saveOrganization(OrganizationEntity organizationEntity) {
		log.info("Entered Save Organization : {}" ,organizationEntity.getOrganizationName());
		
		organizationRepository.save(organizationEntity);
		return null;
	}

}
