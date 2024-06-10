package com.ssafy.travelcompass.domain.review.model.entity;

import com.ssafy.travelcompass.domain.attraction.model.entity.AttractionInfo;
import com.ssafy.travelcompass.domain.trip.model.entity.TripDetail;
import com.ssafy.travelcompass.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TripReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_review_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", nullable = false)
    private AttractionInfo attractionInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_detail_id", nullable = false)
    private TripDetail tripDetail;

    @Column(nullable = false, length = 500)
    private String content;

    @Column(nullable = false)
    private int star;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;
}
