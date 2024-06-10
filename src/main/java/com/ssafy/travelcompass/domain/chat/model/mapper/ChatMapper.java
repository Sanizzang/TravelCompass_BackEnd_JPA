package com.ssafy.travelcompass.domain.chat.model.mapper;

import com.ssafy.travelcompass.domain.chat.model.dto.ChatDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface ChatMapper {

	
	void saveChat(ChatDto chat) throws SQLException;

	List<ChatDto> getChatsByTripDetailId(Long tripDetailId, int offset, int size) throws SQLException;

	int countChatsByTripDetailId(Long tripDetailId) throws SQLException;

}
