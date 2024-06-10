package com.ssafy.travelcompass.domain.trip.model.dto.plan;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TripPlanDto {
	int tripPlanId;
	int tripDetailId;
	LocalDate tripDate;
}
