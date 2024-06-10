package com.ssafy.travelcompass.domain.mypage.model.service;

import com.ssafy.travelcompass.domain.mypage.model.dto.MypagePlanDto;
import com.ssafy.travelcompass.domain.mypage.model.dto.MypageTripDto;

import java.util.List;

public interface MypageService {
	List<MypagePlanDto> getMypagePlan(int userId);
	List<MypageTripDto> getMypageTrip(int userId);
}
