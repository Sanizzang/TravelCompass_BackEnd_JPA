package com.ssafy.travelcompass.domain.mypage.model.service;

import com.ssafy.travelcompass.domain.mypage.model.dto.MypagePlanDto;
import com.ssafy.travelcompass.domain.mypage.model.dto.MypageTripDto;
import com.ssafy.travelcompass.domain.mypage.model.mapper.MypageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MypageServiceImpl implements MypageService {
	private final MypageMapper mypageMapper;

	@Override
	public List<MypagePlanDto> getMypagePlan(int userId) {
		return mypageMapper.getMypagePlan(userId);
	}

	@Override
	public List<MypageTripDto> getMypageTrip(int userId) {
		return mypageMapper.getMypageTrip(userId);
	}
}
