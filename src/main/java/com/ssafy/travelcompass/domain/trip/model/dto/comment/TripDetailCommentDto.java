package com.ssafy.travelcompass.domain.trip.model.dto.comment;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TripDetailCommentDto {
	int tripDetailCommentId;
	int tripDetailId;
	int parentId;
	int userId;
	String content;
	LocalDateTime createAt;
}
