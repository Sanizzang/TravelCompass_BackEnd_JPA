package com.ssafy.travelcompass.domain.share.model.dto;

import lombok.Data;

@Data
public class TripShareLikeDto {
	int tripShareLikeId;
	int tripShareId;
	int userId;
}
