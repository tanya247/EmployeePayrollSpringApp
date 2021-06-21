package com.example.employeepayroll.DTO;


public class EmployeePayrollDTO {
	public String name;
	public String salary;
	public EmployeePayrollDTO(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + "]";
	}
}
