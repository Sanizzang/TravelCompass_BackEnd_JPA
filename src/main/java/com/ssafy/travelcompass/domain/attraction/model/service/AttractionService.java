package com.ssafy.travelcompass.domain.attraction.model.service;

import com.ssafy.travelcompass.domain.attraction.model.dto.AttractionInfoDto;
import com.ssafy.travelcompass.domain.attraction.model.dto.GugunDto;
import com.ssafy.travelcompass.domain.attraction.model.dto.SidoDto;

import java.util.List;

public interface AttractionService {
	List<SidoDto> getSidoList();
	List<GugunDto> getGugunList(int sidoCode);
	List<AttractionInfoDto> getAttractionList(int sidoCode, int gugunCode, String keyword);
}
