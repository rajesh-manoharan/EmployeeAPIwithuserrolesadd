package com.greatlearning.emapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.greatlearning.emapi.dao.UserRepository;
import com.greatlearning.emapi.dto.RoleDto;
import com.greatlearning.emapi.dto.UserDto;
import com.greatlearning.emapi.security.entity.Role;
import com.greatlearning.emapi.security.entity.User;
import com.greatlearning.emapi.service.UserCreateService;

@Service
public class UserCreateServiceImpl implements UserCreateService {

	private UserRepository userRepository;
	private ModelMapper mapper;

	public UserCreateServiceImpl(UserRepository userRepository, ModelMapper mapper) {
		this.userRepository = userRepository;
		this.mapper = mapper;
	}

	private Role mapDtoToEntity(RoleDto roleDto) {
		Role role = mapper.map(roleDto, Role.class);
		return role;
	}

	private User mapDtoToEntity(UserDto userDto) {
		User user = mapper.map(userDto, User.class);
		return user;
	}

	private UserDto mapEntityToDto(User user) {
		UserDto userDto = mapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public UserDto createUser(UserDto userDto, List<RoleDto> roleDto) {
		System.out.println("UserDto" + userDto);
		System.out.println("RoleDto" + roleDto);
		User user = mapDtoToEntity(userDto);
		List<Role> roles = new ArrayList<Role>();
		for (RoleDto roleDtos : roleDto) {
			roles.add(mapDtoToEntity(roleDtos));
			
		}
		user.setRoles(roles);
		User createdUser = userRepository.save(user);
		return mapEntityToDto(createdUser);
	}
}
