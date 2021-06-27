package com.example.employeepayroll.service;

import java.util.List;

import com.example.employeepayroll.DTO.EmployeePayrollDTO;
import com.example.employeepayroll.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);
	void deleteEmployeePayrollData(int empId);
	

	
}
