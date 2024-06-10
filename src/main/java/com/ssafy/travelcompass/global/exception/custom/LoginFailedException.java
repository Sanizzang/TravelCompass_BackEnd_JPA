package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class LoginFailedException extends CustomException {
	
	private static final long serialVersionUID = 1L;

	public LoginFailedException() {
		super("아이디 또는 패스워드 확인이 필요합니다.", HttpStatus.UNAUTHORIZED);
	}

}
