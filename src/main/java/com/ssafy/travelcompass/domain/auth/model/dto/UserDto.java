package com.ssafy.travelcompass.domain.auth.model.dto;

import com.ssafy.travelcompass.global.util.encrypt.EncryptHelper;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
	int userId;
	String email;
	String password;
	String username;
	String nickname;
	String gender;
	LocalDate birthday;
	int totalStar;
	int totalStarCount;
	String refreshToken;
	String profile;
	
	public void encryptPassword(EncryptHelper encryptHelper) {
		this.password = encryptHelper.encrypt(this.password);
	}
}
