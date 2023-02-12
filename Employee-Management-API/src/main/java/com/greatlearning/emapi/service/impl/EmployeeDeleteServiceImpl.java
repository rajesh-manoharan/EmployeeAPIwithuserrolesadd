package com.greatlearning.emapi.service.impl;

import org.springframework.stereotype.Service;

import com.greatlearning.emapi.dao.EmployeeRepository;
import com.greatlearning.emapi.service.EmployeeDeleteService;
import com.greatlearning.emapi.service.exception.ResourceNotFoundException;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

	private EmployeeRepository employeeRepository;

	public EmployeeDeleteServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
		employeeRepository.deleteById(id);
	}
}
