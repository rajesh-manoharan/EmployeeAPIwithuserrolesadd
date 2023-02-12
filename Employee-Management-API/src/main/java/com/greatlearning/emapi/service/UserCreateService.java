package com.greatlearning.emapi.service;

import java.util.List;

import com.greatlearning.emapi.dto.RoleDto;
import com.greatlearning.emapi.dto.UserDto;

public interface UserCreateService {

	UserDto createUser(UserDto userDto,List<RoleDto> roleDto);
}
