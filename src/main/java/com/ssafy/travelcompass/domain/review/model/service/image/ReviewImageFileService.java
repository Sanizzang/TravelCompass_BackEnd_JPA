package com.ssafy.travelcompass.domain.review.model.service.image;

import com.ssafy.travelcompass.domain.review.model.dto.image.ReviewImageFileDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ReviewImageFileService {

	public void saveImage(int tripReviewId, List<MultipartFile> reviewImageList) throws Exception;

	public List<ReviewImageFileDto> findByTripReviewId(int tripReviewId) throws Exception;

	public void deleteReviewImageByReviewId(int tripReviewId) throws Exception;

	public void updateImage(int tripReviewId, List<MultipartFile> reviewImageList) throws Exception;
}
