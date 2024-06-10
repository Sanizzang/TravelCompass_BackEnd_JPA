package com.ssafy.travelcompass.domain.trip.model.service.member;

import com.ssafy.travelcompass.domain.trip.model.dto.member.TripDetailMemberDto;

import java.util.List;

public interface MemberService {

	void regist(TripDetailMemberDto tripDetailMemberDto) throws Exception;

	List<TripDetailMemberDto> findByUserId(int userId) throws Exception;

	List<TripDetailMemberDto> findByTripDetailId(int tripDetailId) throws Exception;

	TripDetailMemberDto findByIdAndUserId(int tripDetailId, int userId) throws Exception;

}
