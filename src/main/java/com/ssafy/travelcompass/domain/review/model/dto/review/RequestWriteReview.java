package com.ssafy.travelcompass.domain.review.model.dto.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestWriteReview {

	private int tripReviewId;
	private int contentId;
	private int tripDetailId;
	private List<MultipartFile> reviewImageList;
	private String content;
	private List<String> reviewTagList;
	private int star;
	
	private int userId;
}
