package com.ssafy.travelcompass.domain.review.model.service.like;

import com.ssafy.travelcompass.domain.review.model.dto.like.ReviewLikeDto;

public interface ReviewLikeService {

	void toggleLike(ReviewLikeDto like) throws Exception;

	boolean isLiked(int tripReviewId, int userId) throws Exception;

}
