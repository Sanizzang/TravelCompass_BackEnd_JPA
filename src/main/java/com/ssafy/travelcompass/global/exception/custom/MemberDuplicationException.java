package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class MemberDuplicationException extends CustomException {
	
	private static final long serialVersionUID = 1L;

	public MemberDuplicationException() {
		super("이미 동행자입니다.", HttpStatus.CONFLICT);
	}
}
