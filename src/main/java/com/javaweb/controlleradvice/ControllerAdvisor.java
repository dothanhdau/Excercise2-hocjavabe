package com.javaweb.controlleradvice;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.javaweb.model.ErrorResponseDTO;

import CustomException.FieldRequiredException;
@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler{
	@ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> HandleArithmeticException(
            ArithmeticException ex,WebRequest request){
		ErrorResponseDTO error=new ErrorResponseDTO();
		error.setError(ex.getMessage());
		ArrayList<String> detals=new ArrayList<>();
		detals.add("sao mà chia đc cho số không!");
		error.setDetal(detals);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	@ExceptionHandler(FieldRequiredException.class)
	public ResponseEntity<Object> HandleFieldRqueiredException(
			FieldRequiredException ex,WebRequest request){
		ErrorResponseDTO error=new ErrorResponseDTO();
		error.setError(ex.getMessage());
		ArrayList<String> detals=new ArrayList<>();
		detals.add("Tên nhập sai hoặc bị gì đó r????");
		error.setDetal(detals);
        return new ResponseEntity<>(error, HttpStatus.BAD_GATEWAY);
    }
}
