package com.ssafy.travelcompass.domain.attraction.model.service;

import com.ssafy.travelcompass.domain.attraction.model.dto.AttractionInfoDto;
import com.ssafy.travelcompass.domain.attraction.model.dto.GugunDto;
import com.ssafy.travelcompass.domain.attraction.model.dto.SidoDto;
import com.ssafy.travelcompass.domain.attraction.model.mapper.AttractionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttractionServiceImpl implements AttractionService {
	private final AttractionMapper attractionMapper;

	@Override
	public List<SidoDto> getSidoList() {
		return attractionMapper.getSidoList();
	}

	@Override
	public List<GugunDto> getGugunList(int sidoCode) {
		return attractionMapper.getGugunList(sidoCode);
	}

	@Override
	public List<AttractionInfoDto> getAttractionList(int sidoCode, int gugunCode, String keyword) {
		return attractionMapper.getAttractionList(sidoCode, gugunCode, keyword);
	}
}
