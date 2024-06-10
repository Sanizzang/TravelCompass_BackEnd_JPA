package com.ssafy.travelcompass.domain.home.model.mapper;

import com.ssafy.travelcompass.domain.home.model.dto.RecentTripDto;
import com.ssafy.travelcompass.domain.home.model.dto.BestPlanViewDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeMapper {
	List<BestPlanViewDto> getBestPlanView();
	List<RecentTripDto> getRecentTrip();
}
