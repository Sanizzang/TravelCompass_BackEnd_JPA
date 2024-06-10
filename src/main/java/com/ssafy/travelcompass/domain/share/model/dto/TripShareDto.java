package com.ssafy.travelcompass.domain.share.model.dto;

import com.ssafy.travelcompass.domain.trip.model.dto.trip.TripDetailDto;
import lombok.Data;

import java.util.List;

@Data
public class TripShareDto {
	int tripShareId;
	String title;
	String content;
	int view;
	int tripDetailId;
	TripDetailDto tripDetail;
	List<TripShareCommentDto> tripShareCommentList;
	List<TripShareLikeDto> tripShareLikeList;
	List<TripShareTagDto> tripShareTagList;
}
