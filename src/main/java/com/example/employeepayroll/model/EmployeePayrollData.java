package com.example.employeepayroll.model;

import java.time.LocalDate;
import java.util.List;

import com.example.employeepayroll.DTO.EmployeePayrollDTO;

import lombok.Data;

@Data
public class EmployeePayrollData {
	private int empId;
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String Note;
	private String ProfilePic;
	private List<String> department;
	
	
	
	public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.empId = empId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.startDate = employeePayrollDTO.startDate;
		this.Note = employeePayrollDTO.Note;
		this.ProfilePic = employeePayrollDTO.ProfilePic;
		this.department = employeePayrollDTO.department;
	}


}
