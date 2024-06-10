package com.ssafy.travelcompass.domain.review.model.mapper;

import com.ssafy.travelcompass.domain.review.model.dto.review.TripReviewDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface ReviewMapper {
	void writeReview(TripReviewDto tripReviewDto) throws SQLException;

	List<TripReviewDto> getReviews(Map<String, Object> map) throws SQLException;

	List<TripReviewDto> getReviewsByTripDetailId(int tripDetailId) throws SQLException;

	TripReviewDto findById(int tripReviewId) throws SQLException;

	boolean isValid(Map<String, Object> map) throws SQLException;

	void deleteReviewById(int tripReviewId) throws SQLException;

	void updateReviewById(TripReviewDto tripReviewDto) throws SQLException;

	List<TripReviewDto> getReviewsByUserId(int userId) throws SQLException;
}
