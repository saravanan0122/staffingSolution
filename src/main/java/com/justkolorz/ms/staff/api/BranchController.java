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

import com.justkolorz.ms.staff.db.entity.BranchEntity;
import com.justkolorz.ms.staff.db.repository.BranchRepository;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/branch")
@CrossOrigin
@Log4j2
public class BranchController {

	@Autowired
	BranchRepository branchRepository;

	@PostMapping("/create")
	private ResponseEntity<String> craeteBranch(@RequestBody BranchEntity branch) {
		return new ResponseEntity<>(branchRepository.save(branch).getBranchName(), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<String> updateBranch(@RequestBody BranchEntity branch) {
		return new ResponseEntity<>(branchRepository.save(branch).getBranchName(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{branchId}")
	private ResponseEntity<String> deleteBranch(@PathVariable("branchId")  String branchId) {
		branchRepository.deleteById(UUID.fromString(branchId));
		return ResponseEntity.ok("Branch deleted");
	}

	@GetMapping("/getById/{branchId}")
	private ResponseEntity<Optional<BranchEntity>> getBranchById(@PathVariable("branchId")  String branchId) {
		Optional<BranchEntity> branch = branchRepository.findById(UUID.fromString(branchId));
		return ResponseEntity.ok().body(branch);
	}

	@GetMapping("/getBranchs")
	private ResponseEntity<List<BranchEntity>> getBranchs() {
		List<BranchEntity> branchs = branchRepository.findAll();
		return ResponseEntity.ok().body(branchs);
	}

}
