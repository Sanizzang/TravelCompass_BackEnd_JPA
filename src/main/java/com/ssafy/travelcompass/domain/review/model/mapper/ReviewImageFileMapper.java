package com.ssafy.travelcompass.domain.review.model.mapper;

import com.ssafy.travelcompass.domain.review.model.dto.image.ReviewImageFileDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface ReviewImageFileMapper {

	void addImageByTripReviewId(Map<String, Object> map) throws SQLException;

	List<ReviewImageFileDto> findByTripReviewId(int tripReviewId) throws SQLException;

	void deleteByReviewId(int tripReviewId) throws SQLException;

}
