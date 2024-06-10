package com.ssafy.travelcompass.domain.trip.model.dto.file;

import lombok.Data;

@Data
public class TripImageFileDto {
	int tripImageFileId;
	int tripDetailId;
	String path;
}
