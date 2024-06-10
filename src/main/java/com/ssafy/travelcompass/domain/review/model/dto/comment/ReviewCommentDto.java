package com.ssafy.travelcompass.domain.review.model.dto.comment;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReviewCommentDto {
	private int reviewCommentId;
	private int tripReviewId;
	private int parentReviewCommentId;
	private int userId; // 작성자 userId
	private String content;
	private LocalDateTime createdAt;
	
	private String nickName; // 작성자 닉네임
	private String profile; // 프로필 이미지 경로
	
	private List<ReviewCommentDto> replies;
	private int replyCnt;
	
}
