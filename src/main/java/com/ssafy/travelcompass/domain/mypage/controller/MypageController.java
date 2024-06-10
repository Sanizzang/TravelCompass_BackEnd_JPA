package com.ssafy.travelcompass.domain.mypage.controller;

import com.ssafy.travelcompass.domain.mypage.model.service.MypageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mypage")
@RequiredArgsConstructor
public class MypageController {
	private final MypageService mypageService;
	
	@GetMapping("/plan/{userId}")
	public ResponseEntity<?> getMypagePlanList(@PathVariable int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(mypageService.getMypagePlan(userId));
	}
	
	@GetMapping("/trip/{userId}")
	public ResponseEntity<?> getMypageTripList(@PathVariable int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(mypageService.getMypageTrip(userId));
	}
	
}
