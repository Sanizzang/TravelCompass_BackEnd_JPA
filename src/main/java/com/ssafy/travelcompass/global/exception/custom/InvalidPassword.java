package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class InvalidPassword extends CustomException {

	private static final long serialVersionUID = 1L;

	public InvalidPassword() {
		super("유효하지 않은 패스워드입니다.", HttpStatus.UNAUTHORIZED);
	}

}
