package com.ssafy.travelcompass.domain.trip.model.dto.plan;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TripPlanAttractionDto {
	int contentId;
	int contentTypeId;
	String title;
	String addr1;
	String addr2;
	String zipcode;
	String tel;
	String firstImage;
	String firstImage2;
	int readCount;
	int sidoCode;
	int gugunCode;
	String latitude;
	String longitude;
	String mlevel;
	
	LocalDate tripDate;
	int activityOrder;
}
