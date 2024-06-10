package com.ssafy.travelcompass.domain.home.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BestPlanViewDto {
	private int tripDetailId;
	private String imagePath;
	private String sidoName;
	private String title;
	private LocalDate startDate;
	private LocalDate endDate;
	private String nickname;
	private int maxCapacity;
	private int view;
	private LocalDate createdAt;
	private int createdTime;
}
