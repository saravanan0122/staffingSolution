package com.justkolorz.ms.staff.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.justkolorz.ms.staff.db.entity.OrganizationEntity;
import com.justkolorz.ms.staff.db.repository.OrganizationRepository;
import com.justkolorz.ms.staff.model.Organization;

@RestController
@RequestMapping("/organization")
@CrossOrigin
public class OrganizationController {
	
	@Autowired
	OrganizationRepository organizationRepository;
	
	@PostMapping("/create")
	private OrganizationEntity craeteOrganization(@RequestBody OrganizationEntity organization ) {

			return organizationRepository.save(organization);
			
			
			
	
	}

}
