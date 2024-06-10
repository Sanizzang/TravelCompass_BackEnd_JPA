package com.ssafy.travelcompass.domain.review.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewImageFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_image_file_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_review_id", nullable = false)
    private TripReview tripReview;

    @Column(nullable = false, length = 100)
    private String path;

    @Builder
    public ReviewImageFile(TripReview tripReview, String path) {
        this.tripReview = tripReview;
        this.path = path;
    }
}