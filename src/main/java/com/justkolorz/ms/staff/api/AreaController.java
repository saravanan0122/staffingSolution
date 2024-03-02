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

import com.justkolorz.ms.staff.db.entity.AreaEntity;
import com.justkolorz.ms.staff.db.repository.AreaRepository;
import com.justkolorz.ms.staff.db.repository.ZoneRepository;
import com.justkolorz.ms.staff.dto.AreaDTO;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/area")
@CrossOrigin
@Log4j2
public class AreaController {

	@Autowired
	AreaRepository areaRepository;

	@Autowired
	ZoneRepository zoneRepository;


	@PostMapping("/create")
	private ResponseEntity<String> craeteArea(@RequestBody AreaDTO area) {

		var zone = zoneRepository.findById(UUID.fromString(area.getZoneId()));
		var areaEntity  = new AreaEntity();
		BeanUtils.copyProperties(area, areaEntity);
		areaEntity.setZoneId(zone.get());
		return new ResponseEntity<>(areaRepository.save(areaEntity).getAreaName(), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<String> updateArea(@RequestBody AreaDTO area) {
		String[] ignoreProperties = {"areaId","zoneId"};
		var areaEntity  = new AreaEntity();
		BeanUtils.copyProperties(area, areaEntity,ignoreProperties);
		areaEntity.setAreaId(UUID.fromString(area.getAreaId()));
		return new ResponseEntity<>(areaRepository.save(areaEntity).getAreaName(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{areaId}")
	private ResponseEntity<String> deleteArea(@PathVariable("areaId")  String areaId) {
		areaRepository.deleteById(UUID.fromString(areaId));
		return ResponseEntity.ok("Area deleted");
	}

	@GetMapping("/getById/{areaId}")
	private ResponseEntity<Optional<AreaEntity>> getAreaById(@PathVariable("areaId")  String areaId) {
		Optional<AreaEntity> area = areaRepository.findById(UUID.fromString(areaId));
		return ResponseEntity.ok().body(area);
	}

	@GetMapping("/getAreas")
	private ResponseEntity<List<AreaEntity>> getAreas() {
		List<AreaEntity> areas = areaRepository.findAll();
		return ResponseEntity.ok().body(areas);
	}

}