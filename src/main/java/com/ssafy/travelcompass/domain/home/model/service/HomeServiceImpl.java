package com.ssafy.travelcompass.domain.home.model.service;

import com.ssafy.travelcompass.domain.home.model.dto.BestPlanViewDto;
import com.ssafy.travelcompass.domain.home.model.dto.RecentTripDto;
import com.ssafy.travelcompass.domain.home.model.mapper.HomeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {
	private final HomeMapper homeMapper;

	@Override
	public List<BestPlanViewDto> getBestPlanView() {
		return homeMapper.getBestPlanView();
	}

	@Override
	public List<RecentTripDto> getRecentTrip() {
		return homeMapper.getRecentTrip();
	}
}
