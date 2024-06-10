package com.ssafy.travelcompass.domain.mypage.model.mapper;

import com.ssafy.travelcompass.domain.mypage.model.dto.MypagePlanDto;
import com.ssafy.travelcompass.domain.mypage.model.dto.MypageTripDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MypageMapper {
	List<MypagePlanDto> getMypagePlan(int userId);
	List<MypageTripDto> getMypageTrip(int userId);
}
