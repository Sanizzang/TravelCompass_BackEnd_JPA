package com.ssafy.travelcompass.domain.trip.model.dto.tag;

import lombok.Data;

@Data
public class TripDetailTagDto {
	int tripDetailTagId;
	int tripDetailId;
	String tag;
}
