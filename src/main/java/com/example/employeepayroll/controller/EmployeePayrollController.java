package com.example.employeepayroll.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeepayroll.DTO.EmployeePayrollDTO;
import com.example.employeepayroll.DTO.ResponseDTO;
import com.example.employeepayroll.model.EmployeePayrollData;


@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Tanya", 5000));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Tanya", 5000));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Tanya", 5000));
		ResponseDTO respDTO = new ResponseDTO("Created Employee Data", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Tanya", 5000));
		ResponseDTO respDTO = new ResponseDTO("Updated Employee Data", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfull", "Deleted id "+empId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
}