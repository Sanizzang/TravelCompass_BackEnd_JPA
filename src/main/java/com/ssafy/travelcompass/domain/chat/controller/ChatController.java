package com.ssafy.travelcompass.domain.chat.controller;

import com.ssafy.travelcompass.domain.chat.model.dto.ChatDto;
import com.ssafy.travelcompass.domain.chat.model.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class ChatController {
	
	private final ChatService chatService;

	@GetMapping("/{tripDetailId}")
	public ResponseEntity<List<ChatDto>> getChats(@PathVariable Long tripDetailId,
												  @RequestParam("page") int page,
												  @RequestParam("size") int size) throws Exception {
		int offset = page * size;
		List<ChatDto> result = chatService.getChatsByTripDetailId(tripDetailId, offset, size);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
