package com.ssafy.travelcompass.domain.trip.model.dto.trip;

import com.ssafy.travelcompass.domain.trip.model.dto.member.TripDetailMemberDto;
import com.ssafy.travelcompass.domain.trip.model.dto.plan.TripPlanAttractionDto;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class TripDetailImageDto {
	int tripDetailId;
	int userId;

	String imagePath;
	String sidoName;
	String title;
	LocalDate startDate;
	LocalDate endDate;
	String nickname;
	int maxCapacity;
	int view;
	LocalDateTime createdAt;
	int createTime;

	String content;
	int sidoCode;
	
	MultipartFile image;

	List<TripDetailMemberDto> memberList;
	List<List<TripPlanAttractionDto>> tripPlanAttractionList;
}
