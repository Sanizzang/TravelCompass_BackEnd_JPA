package com.ssafy.travelcompass.domain.review.model.service.comment;

import com.ssafy.travelcompass.domain.review.model.dto.comment.ReviewCommentDto;

import java.util.List;

public interface ReviewCommentService {

	List<ReviewCommentDto> getCommentsByTripReviewId(int tripReviewId, int offset, int size) throws Exception;

	ReviewCommentDto writeComment(ReviewCommentDto comment) throws Exception;

	ReviewCommentDto writeCommentReply(ReviewCommentDto reply) throws Exception;

}
