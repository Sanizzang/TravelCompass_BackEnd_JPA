package com.ssafy.travelcompass.domain.chat.model.service;

import com.ssafy.travelcompass.domain.chat.model.dto.ChatDto;

import java.util.List;

public interface ChatService {

	void saveChat(ChatDto chat) throws Exception;

	List<ChatDto> getChatsByTripDetailId(Long tripDetailId, int offset, int size) throws Exception;
	int countChatsByTripDetailId(Long tripDetailId) throws Exception;

}
