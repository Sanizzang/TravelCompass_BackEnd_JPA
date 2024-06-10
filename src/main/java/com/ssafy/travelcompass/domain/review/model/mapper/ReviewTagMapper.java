package com.ssafy.travelcompass.domain.review.model.mapper;

import com.ssafy.travelcompass.domain.review.model.dto.tag.ReviewTagDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface ReviewTagMapper {

	void addTag(Map<String, Object> map) throws SQLException;

	List<ReviewTagDto> findByTripReviewId(int tripReviewId) throws SQLException;

	void deleteTagsByReviewId(int tripReviewId) throws SQLException;

}
