package com.example.employeepayroll.DTO;


public class EmployeePayrollDTO {
	public String name;
	public long salary;
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
