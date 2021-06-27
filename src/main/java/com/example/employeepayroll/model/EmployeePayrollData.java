package com.example.employeepayroll.model;

import com.example.employeepayroll.DTO.EmployeePayrollDTO;

import lombok.Data;

@Data
public class EmployeePayrollData {
	private int empId;
	private String name;
	private long salary;
	
	
	
	public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.empId = empId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
	}


}
