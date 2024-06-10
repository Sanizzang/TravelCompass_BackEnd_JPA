package com.ssafy.travelcompass.domain.review.model.service.tag;

import com.ssafy.travelcompass.domain.review.model.dto.tag.ReviewTagDto;
import com.ssafy.travelcompass.domain.review.model.mapper.ReviewTagMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
@RequiredArgsConstructor
public class ReviewTagServiceImpl implements ReviewTagService {
	private final ReviewTagMapper reviewTagMapper;
	
	@Override
	public void addTagListByReviewId(int tripReviewId, List<String> reviewTagList) throws Exception {
		
		for(String tag: reviewTagList) {
			Map<String, Object> map = new HashMap<>();
			
			map.put("tripReviewId", tripReviewId);
			map.put("tag", tag);
			
			reviewTagMapper.addTag(map);
		}
	}

	@Override
	public List<ReviewTagDto> findByTripReviewId(int tripReviewId) throws Exception {
		List<ReviewTagDto> tags = reviewTagMapper.findByTripReviewId(tripReviewId);
		return tags;
	}

	@Override
	public void updateTagListByReviewId(int tripReviewId, List<String> reviewTagList) throws Exception {
		reviewTagMapper.deleteTagsByReviewId(tripReviewId);
		
		addTagListByReviewId(tripReviewId, reviewTagList);
	}

}
