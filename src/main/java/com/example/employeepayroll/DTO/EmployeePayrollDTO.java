package com.example.employeepayroll.DTO;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Invalid Name")
	public String name;
	
	@Min(value = 500, message = "Salary is too low , Invalid Employee")
	public long salary;
	
	@Pattern(regexp = "Male|Female",message ="Gender needs to be Male or Female")
	public String gender;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	@NotNull(message = "Start Date should not be blank")
	@PastOrPresent
	public LocalDate startDate;
	
	@NotBlank(message = "Note should not be blank")
	public String Note;
	
	@NotBlank(message = "Profile Pic should not be blank")
	public String ProfilePic;
	
	@NotNull(message = "Department should not be blank")
	public List<String> department;
	
    public EmployeePayrollDTO() {
		
	}
    
	public EmployeePayrollDTO(String name, long salary, String gender,LocalDate startDate, String note, String profilePic, List<String> department) {
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
