package com.example.employeepayroll.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeepayroll.DTO.EmployeePayrollDTO;
import com.example.employeepayroll.exception.EmployeePayrollException;
import com.example.employeepayroll.model.EmployeePayrollData;


@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	
	private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData(){
		return employeePayrollDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return employeePayrollDataList.stream()
				   .filter(addressData -> addressData.getEmpId() == empId)
				   .findFirst()
				   .orElseThrow(() -> new EmployeePayrollException("Employee not found"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		employeePayrollDataList.add(employeePayrollData);
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
		employeePayrollData.setName(employeePayrollDTO.name);
		employeePayrollData.setSalary(employeePayrollDTO.salary);
		employeePayrollDataList.set(empId-1, employeePayrollData);
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		EmployeePayrollData employeePayrollData = employeePayrollDataList.stream()
				.filter(empData -> empData.getEmpId() == empId)
				.findFirst()
				.orElseThrow(() -> new EmployeePayrollException("Delete cannot be successfull !! InvalidId"));	
	int delete = employeePayrollDataList.indexOf(employeePayrollData);
	employeePayrollDataList.remove(delete);
		
	}

}