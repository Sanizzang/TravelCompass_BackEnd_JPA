package com.ssafy.travelcompass.domain.trip.model.service.trip;

import com.ssafy.travelcompass.domain.trip.model.dto.trip.TripDetailDto;

import java.time.LocalDate;
import java.util.List;

public interface TripService {
	List<TripDetailDto> getTripDetailList(LocalDate date, int sidoCode, String keyword);
	List<TripDetailDto> getShareList(LocalDate date, int sidoCode, String keyword);
	TripDetailDto getTripDetail(int tripDetailId);
	void registTripDetail(TripDetailDto tripDetailDto ) throws Exception;
	boolean getDuplicationTripId(int userId, LocalDate startDate, LocalDate endDate);
	TripDetailDto getProceedTrip(int userId);
	void upCountViewI(int tripDetailId);
	void deleteTripDetail(int tripDetailId);
	void updateTripDetail(TripDetailDto tripDetailDto);
}
