package kr.co.softcampus.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(java.lang.NullPointerException.class)//널포인트에러발생시 실행
	public String handleException() {//메소드이름은 맘대로
		return "error2";
	}
}
