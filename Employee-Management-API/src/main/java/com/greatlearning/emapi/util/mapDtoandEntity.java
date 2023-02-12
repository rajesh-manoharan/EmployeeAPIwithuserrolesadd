//package com.greatlearning.emapi.util;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.context.annotation.Bean;
//
//import com.greatlearning.emapi.dto.EmployeeDto;
//import com.greatlearning.emapi.entity.Employee;
//
//public class mapDtoandEntity {
//
//	private ModelMapper mapper;
//	
//	public mapDtoandEntity(ModelMapper mapper) {
//		this.mapper = mapper;
//	}
//
//	// convert entity to DTO
//@Bean	
//	public EmployeeDto mapToDto(Employee employee) {
//		EmployeeDto employeeDto = mapper.map(employee, EmployeeDto.class);
//		return employeeDto;
//	}
//	
//	// convert DTO to entity
//
//@Bean
//	public Employee mapToEntity(EmployeeDto employeeDto) {
//		Employee employee = mapper.map(employeeDto, Employee.class);
//		return employee;
//	}
//
//}
