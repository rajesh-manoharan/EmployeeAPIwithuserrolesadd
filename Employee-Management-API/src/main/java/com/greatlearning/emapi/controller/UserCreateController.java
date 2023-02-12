package com.greatlearning.emapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.emapi.dto.UserAddDto;
import com.greatlearning.emapi.dto.UserDto;
import com.greatlearning.emapi.service.UserCreateService;

@RestController
public class UserCreateController {

	private UserCreateService userCreateservice;
	
	public UserCreateController(UserCreateService userCreateservice) {
		this.userCreateservice = userCreateservice;
	}

	@PostMapping("api/v1/user/add")
	public ResponseEntity<UserDto> addEmployee(@RequestBody UserAddDto userAddDto) {
		System.out.println("In here");
		System.out.println("User add DTO" + userAddDto.toString());
		return new ResponseEntity<>(userCreateservice.createUser(userAddDto.getUserDto(),userAddDto.getRoleDto()),HttpStatus.CREATED);
	}
}
