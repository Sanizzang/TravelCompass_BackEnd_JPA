package com.ssafy.travelcompass.domain.user.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfoDto {
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
}
