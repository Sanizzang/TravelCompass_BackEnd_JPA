package com.ssafy.travelcompass.domain.attraction.model.mapper;

import com.ssafy.travelcompass.domain.attraction.model.dto.AttractionInfoDto;
import com.ssafy.travelcompass.domain.attraction.model.dto.GugunDto;
import com.ssafy.travelcompass.domain.attraction.model.dto.SidoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttractionMapper {
	List<SidoDto> getSidoList();
	List<GugunDto> getGugunList(int sidoCode);
	List<AttractionInfoDto> getAttractionList(int sidoCode, int gugunCode, String keyword);
}
