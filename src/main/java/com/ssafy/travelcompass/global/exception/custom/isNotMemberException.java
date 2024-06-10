package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class isNotMemberException extends CustomException {
	
	private static final long serialVersionUID = 1L;

	public isNotMemberException() {
		super("여행 멤버가 아닙니다.", HttpStatus.FORBIDDEN);
	}

}
