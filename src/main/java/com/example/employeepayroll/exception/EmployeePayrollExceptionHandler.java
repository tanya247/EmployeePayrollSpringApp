package com.example.employeepayroll.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.employeepayroll.DTO.ResponseDTO;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {
	private static final String message = "Exception while processing rest request";

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ResponseDTO> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception){
		ResponseDTO responseDTO = new ResponseDTO(message,"Date should have been in the right format");
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMesg = errorList.stream()
							   .map(objErr -> objErr.getDefaultMessage())
							   .collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Exceptions while processing REST Request", errMesg);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(EmployeePayrollException.class)
	public ResponseEntity<ResponseDTO> handleEmployeePayrollException(EmployeePayrollException exception){
		
		ResponseDTO responseDTO = new ResponseDTO("Exceptions while processing REST Request", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
		
	}


}
