package com.ssafy.travelcompass.domain.review.model.dto.like;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewLikeDto {
	private int reviewLikeId;
	private int tripReviewId;
	private int userId;
}
