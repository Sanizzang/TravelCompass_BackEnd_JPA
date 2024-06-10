package com.ssafy.travelcompass.domain.auth.model.service;

import com.ssafy.travelcompass.auth.model.dto.*;
import com.ssafy.travelcompass.domain.auth.model.dto.*;

public interface AuthService {
	void signUp(UserDto requestSignUp) throws Exception;

	void newPassword(RequestNewPassword requestNewPassword) throws Exception;

	int emailAuthNumber(RequestEmailAuthNumber requestEmailAuthToken) throws Exception;

	void emailVerify(RequestEmailVerification requestEmailVerification) throws Exception;

	void isEmailExists(String email) throws Exception;

	void isNickNameExists(String nickName) throws Exception;
	
	UserDto login(UserDto userDto) throws Exception;

	void saveRefreshToken(int userId, String refreshToken) throws Exception;

	UserDto userInfo(int userId) throws Exception;

	void deleteRefreshToken(int userId) throws Exception;

	Object getRefreshToken(int userId) throws Exception;

	String findEmail(String nickName, String birthDay) throws Exception;

	void resetPassword(RequestResetPassword requestResetPassword) throws Exception;

}

