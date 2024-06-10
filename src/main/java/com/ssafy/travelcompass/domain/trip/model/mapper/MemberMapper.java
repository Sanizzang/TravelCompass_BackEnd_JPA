package com.ssafy.travelcompass.domain.trip.model.mapper;

import com.ssafy.travelcompass.domain.trip.model.dto.member.TripDetailMemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {

	boolean isMemberExistsByUserId(int userId) throws SQLException;

	void regist(TripDetailMemberDto tripDetailMemberDto) throws SQLException;

	List<TripDetailMemberDto> findByUserId(int userId) throws SQLException;

	boolean isMemberExistsByUserIdAndTripDetailId(Map<String, Object> map) throws SQLException;

	List<TripDetailMemberDto> findByTripDetailId(int tripDetailId) throws SQLException;

	TripDetailMemberDto findByIdAndUserId(Map<String, Object> map)throws SQLException;

}
