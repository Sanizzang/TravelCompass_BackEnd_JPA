package com.ssafy.travelcompass.domain.alarm.controller;

import com.ssafy.travelcompass.domain.alarm.model.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sse")
public class AlarmController {

	private final NotificationService notificationService;
	
	@GetMapping(value="/connect/{userId}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<SseEmitter> connect(@PathVariable int userId) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(notificationService.connect(userId));
	}
	
	@PostMapping("/joinTrip/trip/{trip-detail-id}")
	public void notifyJoinTrip(@PathVariable("trip-detail-id") int tripDetailId) throws Exception {
		notificationService.notifyJoinTrip(tripDetailId);
	}
}
