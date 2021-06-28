package com.example.employeepayroll.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Invalid Name")
	public String name;
	@Min(value = 500, message = "Salary is too low , Invalid Employee")
	public long salary;
	
    public EmployeePayrollDTO() {
		
	}
    
	public EmployeePayrollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + "]";
	}
}
