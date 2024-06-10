package com.ssafy.travelcompass.domain.review.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_tag_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_review_id", nullable = false)
    private TripReview tripReview;

    @Column(name = "tag", nullable = false, length = 10)
    private String tag;

    @Builder
    public ReviewTag(TripReview tripReview, String tag) {
        this.tripReview = tripReview;
        this.tag = tag;
    }
}