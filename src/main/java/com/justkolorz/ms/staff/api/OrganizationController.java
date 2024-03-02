package com.justkolorz.ms.staff.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justkolorz.ms.staff.db.entity.OrganizationEntity;
import com.justkolorz.ms.staff.db.repository.OrganizationRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/organization")
@CrossOrigin
@Slf4j
public class OrganizationController {

	@Autowired
	OrganizationRepository organizationRepository;

	 Logger log = LoggerFactory.getLogger(OrganizationController.class);

	
	@PostMapping("/create")
	private ResponseEntity<String> craeteOrganization(@RequestBody OrganizationEntity organization) {
		log.info("Entered Create Organization :: {} ", organization.getOrganizationCode());
		return new ResponseEntity<>(organizationRepository.save(organization).getOrganizationName(), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<String> updateOrganization(@RequestBody OrganizationEntity organization) {
		return new ResponseEntity<>(organizationRepository.save(organization).getOrganizationName(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{organizationId}")
	private ResponseEntity<String> deleteOrganization(@PathVariable("organizationId")  String organizationId) {
		organizationRepository.deleteById(UUID.fromString(organizationId));
		return ResponseEntity.ok("Organization deleted");
	}

	@GetMapping("/getById/{organizationId}")
	private ResponseEntity<Optional<OrganizationEntity>> getOrganizationById(@PathVariable("organizationId")  String organizationId) {
		log.info("Entered Get Organization By Id :: {} ", organizationId);
		Optional<OrganizationEntity> organization = organizationRepository.findById(UUID.fromString(organizationId));
		return ResponseEntity.ok().body(organization);
	}

	@GetMapping("/getOrganizations")
	private ResponseEntity<List<OrganizationEntity>> getOrganizations() {
		log.info("Entered Get Organizations :: {} ");
		List<OrganizationEntity> organizations = organizationRepository.findAll();
		return ResponseEntity.ok().body(organizations);
	}

}
