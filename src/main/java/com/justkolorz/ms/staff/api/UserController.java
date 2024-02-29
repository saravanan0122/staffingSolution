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

import com.justkolorz.ms.staff.db.entity.UserEntity;
import com.justkolorz.ms.staff.db.repository.UserRepository;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/user")
@CrossOrigin
@Log4j2
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/create")
	private ResponseEntity<String> craeteUser(@RequestBody UserEntity user) {
		return new ResponseEntity<>(userRepository.save(user).getUserName(), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<String> updateUser(@RequestBody UserEntity user) {
		return new ResponseEntity<>(userRepository.save(user).getUserName(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{userId}")
	private ResponseEntity<String> deleteUser(@PathVariable("userId")  String userId) {
		userRepository.deleteById(UUID.fromString(userId));
		return ResponseEntity.ok("User deleted");
	}

	@GetMapping("/getById/{userId}")
	private ResponseEntity<Optional<UserEntity>> getUserById(@PathVariable("userId")  String userId) {
		Optional<UserEntity> user = userRepository.findById(UUID.fromString(userId));
		return ResponseEntity.ok().body(user);
	}

	@GetMapping("/getUsers")
	private ResponseEntity<List<UserEntity>> getUsers() {
		List<UserEntity> users = userRepository.findAll();
		return ResponseEntity.ok().body(users);
	}

}
