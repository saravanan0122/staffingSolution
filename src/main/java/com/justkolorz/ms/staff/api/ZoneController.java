package com.justkolorz.ms.staff.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
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

import com.justkolorz.ms.staff.db.entity.ZoneEntity;
import com.justkolorz.ms.staff.db.repository.OrganizationRepository;
import com.justkolorz.ms.staff.db.repository.ZoneRepository;
import com.justkolorz.ms.staff.dto.ZoneDTO;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/zone")
@CrossOrigin
@Log4j2
public class ZoneController {

	@Autowired
	ZoneRepository zoneRepository;
	
	@Autowired
	OrganizationRepository orgRepository;
	
	@PostMapping("/create")
	private ResponseEntity<String> craeteZone(@RequestBody ZoneDTO zone) {
		
		var organization = orgRepository.findById(UUID.fromString(zone.getOrganizationId()));
		var zoneEntity  = new ZoneEntity();
		BeanUtils.copyProperties(zone, zoneEntity);
		zoneEntity.setOrganizationId(organization.get());
		return new ResponseEntity<>(zoneRepository.save(zoneEntity).getZoneName(), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<String> updateZone(@RequestBody ZoneDTO zone) {
		String[] ignoreProperties = {"zoneId","organizationId"};
		var zoneEntity  = new ZoneEntity();
		BeanUtils.copyProperties(zone, zoneEntity,ignoreProperties);
		zoneEntity.setZoneId(UUID.fromString(zone.getZoneId()));
		return new ResponseEntity<>(zoneRepository.save(zoneEntity).getZoneName(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{zoneId}")
	private ResponseEntity<String> deleteZone(@PathVariable("zoneId")  String zoneId) {
		zoneRepository.deleteById(UUID.fromString(zoneId));
		return ResponseEntity.ok("Zone deleted");
	}

	@GetMapping("/getById/{zoneId}")
	private ResponseEntity<Optional<ZoneEntity>> getZoneById(@PathVariable("zoneId")  String zoneId) {
		Optional<ZoneEntity> zone = zoneRepository.findById(UUID.fromString(zoneId));
		return ResponseEntity.ok().body(zone);
	}

	@GetMapping("/getZones")
	private ResponseEntity<List<ZoneEntity>> getZones() {
		List<ZoneEntity> zones = zoneRepository.findAll();
		return ResponseEntity.ok().body(zones);
	}

}
