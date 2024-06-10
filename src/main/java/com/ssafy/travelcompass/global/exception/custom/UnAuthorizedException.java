package com.ssafy.travelcompass.global.exception.custom;

import com.ssafy.travelcompass.global.exception.CustomException;
import org.springframework.http.HttpStatus;

public class UnAuthorizedException extends CustomException {
	
	
	public UnAuthorizedException() {
		super("권한이 없습니다.", HttpStatus.UNAUTHORIZED);
		
	}
}
