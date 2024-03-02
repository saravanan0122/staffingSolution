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
import org.springframework.web.bind.annotation.RestController;

import com.justkolorz.ms.staff.db.entity.DepartmentEntity;
import com.justkolorz.ms.staff.db.repository.DepartmentRepository;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/department")
@CrossOrigin
@Log4j2
public class DepartmentController {

	@Autowired
	DepartmentRepository departmentRepository;

	@PostMapping("/create")
	private ResponseEntity<String> craeteDepartment(@RequestBody DepartmentEntity department) {
		return new ResponseEntity<>(departmentRepository.save(department).getDepartmentName(), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<String> updateDepartment(@RequestBody DepartmentEntity department) {
		return new ResponseEntity<>(departmentRepository.save(department).getDepartmentName(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{departmentId}")
	private ResponseEntity<String> deleteDepartment(@PathVariable("departmentId")  String departmentId) {
		departmentRepository.deleteById(UUID.fromString(departmentId));
		return ResponseEntity.ok("Department deleted");
	}

	@GetMapping("/getById/{departmentId}")
	private ResponseEntity<Optional<DepartmentEntity>> getDepartmentById(@PathVariable("departmentId")  String departmentId) {
		Optional<DepartmentEntity> department = departmentRepository.findById(UUID.fromString(departmentId));
		return ResponseEntity.ok().body(department);
	}

	@GetMapping("/getDepartments")
	private ResponseEntity<List<DepartmentEntity>> getDepartments() {
		List<DepartmentEntity> departments = departmentRepository.findAll();
		return ResponseEntity.ok().body(departments);
	}

}
