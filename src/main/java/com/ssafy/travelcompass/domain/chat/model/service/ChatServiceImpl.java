package com.ssafy.travelcompass.domain.chat.model.service;

import com.ssafy.travelcompass.domain.chat.model.dto.ChatDto;
import com.ssafy.travelcompass.domain.chat.model.mapper.ChatMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {
	
	private final ChatMapper chatMapper;
	
	@Override
	public void saveChat(ChatDto chat) throws Exception {
		chatMapper.saveChat(chat);
	}

	@Override
	public List<ChatDto> getChatsByTripDetailId(Long tripDetailId, int offset, int size) throws Exception{
        return chatMapper.getChatsByTripDetailId(tripDetailId, offset, size);
	}

	@Override
	public int countChatsByTripDetailId(Long tripDetailId) throws Exception {
        return chatMapper.countChatsByTripDetailId(tripDetailId);

	}

}
