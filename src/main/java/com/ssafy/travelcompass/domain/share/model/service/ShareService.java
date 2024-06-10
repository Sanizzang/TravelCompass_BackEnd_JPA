package com.ssafy.travelcompass.domain.share.model.service;

import com.ssafy.travelcompass.domain.share.model.dto.TripShareDto;

import java.util.List;

public interface ShareService {

	List<TripShareDto> getShareList(String type, String key);

}
