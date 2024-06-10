package com.ssafy.travelcompass.domain.chat.controller;

import com.ssafy.travelcompass.domain.chat.model.dto.ChatDto;
import com.ssafy.travelcompass.domain.chat.model.service.ChatService;
import com.ssafy.travelcompass.domain.user.model.dto.UserInfoDto;
import com.ssafy.travelcompass.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MessageController {

	private final SimpMessagingTemplate simpMessagingTemplate;
	private final ChatService chatService;
	private final UserService userService; 
	
	@MessageMapping("/chat")
	public void send(ChatDto chat) throws Exception {
		log.info(chat.toString());
		
		chat.setCreatedAt(LocalDateTime.now());
		chatService.saveChat(chat);
		
		UserInfoDto userInfoDto = userService.findByUserId(chat.getUserId());
		chat.setNickName(userInfoDto.getNickname());
		chat.setProfile(userInfoDto.getProfile());
		
		simpMessagingTemplate.convertAndSend("/topic/messages/" + chat.getTripDetailId(), chat);
	}
	
}
