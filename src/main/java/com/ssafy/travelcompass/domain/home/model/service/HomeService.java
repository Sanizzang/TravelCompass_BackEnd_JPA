package com.ssafy.travelcompass.domain.home.model.service;

import com.ssafy.travelcompass.domain.home.model.dto.BestPlanViewDto;
import com.ssafy.travelcompass.domain.home.model.dto.RecentTripDto;

import java.util.List;

public interface HomeService {
	List<BestPlanViewDto> getBestPlanView();
	List<RecentTripDto> getRecentTrip();
}
