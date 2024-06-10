package com.ssafy.travelcompass.domain.review.model.dto.image;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewImageFileDto {

	private int reviewImageFileId;
	private int tripReviewId;
	private String path;
}
