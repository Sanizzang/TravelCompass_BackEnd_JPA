package com.ssafy.travelcompass.domain.trip.model.mapper;

import com.ssafy.travelcompass.domain.trip.model.dto.member.TripDetailMemberDto;
import com.ssafy.travelcompass.domain.trip.model.dto.plan.TripActivityDto;
import com.ssafy.travelcompass.domain.trip.model.dto.plan.TripPlanAttractionDto;
import com.ssafy.travelcompass.domain.trip.model.dto.plan.TripPlanDto;
import com.ssafy.travelcompass.domain.trip.model.dto.trip.TripDetailDto;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface TripMapper {
	List<TripDetailDto> getTripDetailList(LocalDate date, int sidoCode, String keyword);
	List<TripDetailDto> getShareList(LocalDate date, int sidoCode, String keyword);
	TripDetailDto getTripDetail(int tripDetailId);
	List<TripDetailMemberDto> getTripMemberList(int tripDetailId);
	List<TripPlanAttractionDto> getPlanAttractionList(int tripDetailId);
	Integer getDuplicationTripId(int userId, LocalDate startDate, LocalDate endDate);
	TripDetailDto getProceedTrip(int userId);
	
	void upCountView(int tripDetailId);
	
	void registTripDetail(TripDetailDto tripDetailDto);
	void registTripDetailPlan(TripPlanDto tripPlanDto);
	void registTripActivity(TripActivityDto tripActivityDto);
	
	void updateTripDetail(TripDetailDto tripDetailDto);
	void deleteTripDetail(int tripDetailId);
}
