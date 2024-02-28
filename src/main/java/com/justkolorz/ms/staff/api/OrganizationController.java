package com.justkolorz.ms.staff.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.justkolorz.ms.staff.db.entity.OrganizationEntity;
import com.justkolorz.ms.staff.db.repository.OrganizationRepository;

import jakarta.validation.constraints.NotNull;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/organization")
@CrossOrigin
@Log4j2
public class OrganizationController {

	@Autowired
	OrganizationRepository organizationRepository;

	@PostMapping("/create")
	private ResponseEntity<String> craeteOrganization(@RequestBody OrganizationEntity organization) {
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
		Optional<OrganizationEntity> organization = organizationRepository.findById(UUID.fromString(organizationId));
		return ResponseEntity.ok().body(organization);
	}

	@GetMapping("/getOrganizations")
	private ResponseEntity<List<OrganizationEntity>> getOrganizations() {
		List<OrganizationEntity> organizations = organizationRepository.findAll();
		return ResponseEntity.ok().body(organizations);
	}

}
