package com.mkpits.bank.config;

import com.mkpits.bank.dto.response.ErrorResponseDto;
import com.mkpits.bank.exception.BussinessException;
import com.mkpits.bank.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(400);
        return ResponseEntity.badRequest().body(errorResponseDto);
    }

    @ExceptionHandler(BussinessException.class)
    public ResponseEntity<Object> handleBusinessException(BussinessException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(errorResponseDto);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(HttpStatus.NOT_FOUND.value());
//        return ResponseEntity.Not().body(errorResponseDto);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseDto);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleHibernateValidationException(MethodArgumentNotValidException ex) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setErrorMessage(ex.getMessage());
        errorResponseDto.setHttStatusCode(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().body(errorResponseDto);
    }

}
