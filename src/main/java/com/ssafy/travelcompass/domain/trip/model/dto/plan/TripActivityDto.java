package com.ssafy.travelcompass.domain.trip.model.dto.plan;

import lombok.Data;

@Data
public class TripActivityDto {
	int tripActivityId;
	int tripPlanId;
	int contentId;
	int activityOrder;
}
