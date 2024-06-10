package com.ssafy.travelcompass.domain.share.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TripShareCommentDto {
	int tripShareCommentId;
	int tripShareId;
	int parentTripShareCommentId;
	int userId;
	String content;
	LocalDateTime createAt;
}
