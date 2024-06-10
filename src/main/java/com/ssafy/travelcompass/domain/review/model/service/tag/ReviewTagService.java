package com.ssafy.travelcompass.domain.review.model.service.tag;

import com.ssafy.travelcompass.domain.review.model.dto.tag.ReviewTagDto;

import java.util.List;

public interface ReviewTagService {

	void addTagListByReviewId(int tripReviewId, List<String> reviewTagList) throws Exception;

	List<ReviewTagDto> findByTripReviewId(int tripReviewId) throws Exception;

	void updateTagListByReviewId(int tripReviewId, List<String> reviewTagList) throws Exception;

}
