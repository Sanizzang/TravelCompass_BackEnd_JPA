package com.ssafy.travelcompass.domain.review.controller;

import com.ssafy.travelcompass.domain.review.model.dto.comment.RequestComment;
import com.ssafy.travelcompass.domain.review.model.dto.comment.ReviewCommentDto;
import com.ssafy.travelcompass.domain.review.model.dto.review.RequestWriteReview;
import com.ssafy.travelcompass.domain.review.model.dto.review.TripReviewDto;
import com.ssafy.travelcompass.domain.review.model.service.review.ReviewService;
import com.ssafy.travelcompass.domain.review.model.dto.like.ReviewLikeDto;
import com.ssafy.travelcompass.domain.review.model.service.comment.ReviewCommentService;
import com.ssafy.travelcompass.domain.review.model.service.like.ReviewLikeService;
import com.ssafy.travelcompass.global.util.jwt.JWTUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {
	
	private final ReviewService reviewService;
	private final ReviewCommentService reviewCommentService;
	private final ReviewLikeService reviewLikeService;
	private final JWTUtil jwtUtil;
	
	@PostMapping
	public ResponseEntity<?> writeReview(@ModelAttribute RequestWriteReview requestWriteReview,
										 HttpServletRequest request) throws Exception {
		int userId = jwtUtil.getUserId(request.getHeader("Authorization"));
		requestWriteReview.setUserId(userId);
		
		reviewService.writeReview(requestWriteReview);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();	
	}
	
	@PutMapping("{trip-review-id}")
	public ResponseEntity<?> updateReview(@PathVariable("trip-review-id") int tripReviewId,
										 @ModelAttribute RequestWriteReview requestUpdateReview,
										 HttpServletRequest request) throws Exception {
		int userId = jwtUtil.getUserId(request.getHeader("Authorization"));
		requestUpdateReview.setUserId(userId);
		requestUpdateReview.setTripReviewId(tripReviewId);
		
		reviewService.updateReview(requestUpdateReview);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping
	public ResponseEntity<?> getReviews(@RequestParam("page") int page, 
										@RequestParam("size") int size,
										@RequestParam(required = false) String keyword,
										@RequestParam(required = false) String category) throws Exception {
		
		int offset = page * size;
		List<TripReviewDto> result = reviewService.getReviews(offset, size, keyword, category);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("{trip-review-id}")
	public ResponseEntity<?> getReviewById(@PathVariable("trip-review-id") int tripReviewId) throws Exception {
		
		TripReviewDto result = reviewService.getReviewById(tripReviewId);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("/user/{user-id}")
	public ResponseEntity<?> getReviewsByUserId(@PathVariable("user-id") int userId) throws Exception {
		List<TripReviewDto> result = reviewService.getReviewsByUserId(userId);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("/trip/{trip-detail-id}")
	public ResponseEntity<?> getReviewsByTripDetailId(@PathVariable("trip-detail-id") int tripDetailId) throws Exception {
		
		List<TripReviewDto> result = reviewService.getReviewsByTripDetailId(tripDetailId);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("{trip-review-id}/comment")
	public ResponseEntity<?> getComments(@PathVariable("trip-review-id") int tripReviewId,
										 @RequestParam("page") int page, 
										 @RequestParam("size") int size) throws Exception {
		
		int offset = page * size;
		System.out.println(offset);
		List<ReviewCommentDto> result = reviewCommentService.getCommentsByTripReviewId(tripReviewId, offset, size);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@PostMapping("{trip-review-id}/comment")
	public ResponseEntity<?> writeComment(@PathVariable("trip-review-id") int tripReviewId,
										  @RequestBody RequestComment requestComment,
										  HttpServletRequest request) throws Exception {
		int userId = jwtUtil.getUserId(request.getHeader("Authorization"));
		
		ReviewCommentDto comment = ReviewCommentDto.builder()
									.userId(userId)
									.tripReviewId(tripReviewId)
									.content(requestComment.getContent())
									.build();
		
		ReviewCommentDto result = reviewCommentService.writeComment(comment);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	@PostMapping("{trip-review-id}/comment/{review-comment-id}/reply")
	public ResponseEntity<?> writeCommentReply(@PathVariable("trip-review-id") int tripReviewId,
											   @PathVariable("review-comment-id") int reviewCommentId,
											   @RequestBody RequestComment requestComment,
											   HttpServletRequest request) throws Exception {
		int userId = jwtUtil.getUserId(request.getHeader("Authorization"));
		
		ReviewCommentDto reply = ReviewCommentDto.builder()
				.tripReviewId(tripReviewId)
				.parentReviewCommentId(reviewCommentId)
				.userId(userId)
				.content(requestComment.getContent())
				.build();
		
		ReviewCommentDto result = reviewCommentService.writeCommentReply(reply);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	@PatchMapping("{trip-review-id}/like")
	public ResponseEntity<?> toggleLike(@PathVariable("trip-review-id") int tripReviewId,
										HttpServletRequest request) throws Exception {
		int userId = jwtUtil.getUserId(request.getHeader("Authorization"));
		
		ReviewLikeDto like = ReviewLikeDto.builder()
						.tripReviewId(tripReviewId)
						.userId(userId)
						.build();
		
		reviewLikeService.toggleLike(like);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@DeleteMapping("{trip-review-id}")
	public ResponseEntity<?> deleteReview(@PathVariable("trip-review-id") int tripReviewId,
										  HttpServletRequest request) throws Exception {
		int userId = jwtUtil.getUserId(request.getHeader("Authorization"));
		
		reviewService.deleteReview(userId, tripReviewId);
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	
}
