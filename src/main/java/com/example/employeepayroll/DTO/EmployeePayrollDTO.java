package com.example.employeepayroll.DTO;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Invalid Name")
	public String name;
	@Min(value = 500, message = "Salary is too low , Invalid Employee")
	public long salary;
	public String gender;
	public String startDate;
	public String Note;
	public String ProfilePic;
	public List<String> department;
	
    public EmployeePayrollDTO() {
		
	}
    
	public EmployeePayrollDTO(String name, long salary, String gender,String startDate, String note, String profilePic, List<String> department) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.startDate = startDate;
		this.Note = note;
		this.ProfilePic = profilePic;
		this.department = department;
	}
}
