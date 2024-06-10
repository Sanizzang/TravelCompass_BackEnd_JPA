package com.ssafy.travelcompass.domain.share.model.service;

import com.ssafy.travelcompass.domain.share.model.dto.TripShareDto;
import com.ssafy.travelcompass.domain.share.model.mapper.ShareMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShareServiceImpl implements ShareService {
	private final ShareMapper shareMapper;

	@Override
	public List<TripShareDto> getShareList(String type, String key) {
		List<TripShareDto> tripShareDto = shareMapper.getTripShareList(type, key);
		
		return tripShareDto;
	}
}
