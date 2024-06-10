package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class InvalidEmailAuthTokenException extends CustomException {
	
	private static final long serialVersionUID = 1L;

	public InvalidEmailAuthTokenException() {
		super("유효하지 않은 이메일 인증번호입니다.", HttpStatus.UNAUTHORIZED);
	}
}
