package com.ssafy.travelcompass.domain.review.model.mapper;

import com.ssafy.travelcompass.domain.review.model.dto.comment.ReviewCommentDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface ReviewCommentMapper {

	public List<ReviewCommentDto> getCommentsByTripReviewId(Map<String, Object> map) throws SQLException;

	public List<ReviewCommentDto> getRepliesByParentReviewCommentId(int reviewCommentId) throws SQLException;

	public void writeComment(ReviewCommentDto comment) throws SQLException;

	public ReviewCommentDto findById(int reviewCommentId) throws SQLException;

	public void writeCommentReply(ReviewCommentDto reply) throws SQLException;

}
