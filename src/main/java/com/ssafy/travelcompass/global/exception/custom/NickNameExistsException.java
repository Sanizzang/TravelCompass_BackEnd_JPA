package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class NickNameExistsException extends CustomException {

	private static final long serialVersionUID = 1L;
	
	public NickNameExistsException() {
		super("이미 존재하는 닉네임 입니다.", HttpStatus.CONFLICT);
	}
}
