package com.ssafy.travelcompass.global.util.file;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileSaver {

	String profileSave(MultipartFile file) throws IllegalStateException, IOException;

	void profileRemove(String profilePath);

	List<String> reviewImageSave(List<MultipartFile> reviewImageList) throws IllegalStateException, IOException;

	String tripDetailSave(MultipartFile image) throws IllegalStateException, IOException;

	void reviewImageRemove(List<String> imagePathList);
}
