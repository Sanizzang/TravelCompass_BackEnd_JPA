package com.ssafy.travelcompass.domain.alarm.model.service;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface NotificationService {

	SseEmitter connect(int userId) throws Exception;

	void notifyJoinTrip(int tripDetailId) throws Exception;

}
