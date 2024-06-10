package com.ssafy.travelcompass.domain.share.model.mapper;

import com.ssafy.travelcompass.domain.share.model.dto.TripShareDto;
import com.ssafy.travelcompass.domain.share.model.dto.TripShareTagDto;
import com.ssafy.travelcompass.domain.share.model.dto.TripShareCommentDto;
import com.ssafy.travelcompass.domain.share.model.dto.TripShareLikeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShareMapper {
	List<TripShareDto> getTripShareList(String type, String key);
	TripShareDto getTripShare(int tripShareId);
	List<TripShareCommentDto> getTripShareCommentList(int tripShareId);
	List<TripShareLikeDto> getTripShareLikeList(int tripShareId);
	List<TripShareTagDto> getTripShareTagList(int tripShareId);
}
