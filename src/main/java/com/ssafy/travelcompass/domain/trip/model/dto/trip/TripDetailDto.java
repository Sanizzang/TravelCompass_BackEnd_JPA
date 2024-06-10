package com.ssafy.travelcompass.domain.trip.model.dto.trip;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.travelcompass.domain.trip.model.dto.member.TripDetailMemberDto;
import com.ssafy.travelcompass.domain.trip.model.dto.plan.TripPlanAttractionDto;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class TripDetailDto {
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
	
	MultipartFile image;

	String content;
	int sidoCode;

	List<TripDetailMemberDto> memberList;
	String tripPlanAttractionListJson; // JSON string

    // Transient field to hold the actual list
    List<List<TripPlanAttractionDto>> tripPlanAttractionList;

    public void convertJsonToList() throws JsonProcessingException {
        if (this.tripPlanAttractionListJson != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            this.tripPlanAttractionList = objectMapper.readValue(this.tripPlanAttractionListJson, new TypeReference<List<List<TripPlanAttractionDto>>>() {});
        }
    }
}
