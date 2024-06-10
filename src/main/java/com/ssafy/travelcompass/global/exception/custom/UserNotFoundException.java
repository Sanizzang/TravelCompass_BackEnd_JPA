package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends CustomException {

	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException() {
		super("존재하지 않는 유저입니다.", HttpStatus.NOT_FOUND);
	}
}
