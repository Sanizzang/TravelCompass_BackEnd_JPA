package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class EmailExistsException extends CustomException {
	
	private static final long serialVersionUID = 1L;


	public EmailExistsException() {
		super("이미 존재하는 이메일 입니다.", HttpStatus.CONFLICT);
	}
}
