package com.ssafy.travelcompass.domain.review.model.mapper;

import com.ssafy.travelcompass.domain.review.model.dto.like.ReviewLikeDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface ReviewLikeMapper {

	boolean isLiked(ReviewLikeDto like) throws SQLException;

	void deleteLike(ReviewLikeDto like) throws SQLException;

	void saveLike(ReviewLikeDto like) throws SQLException;

}
