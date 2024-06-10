package com.ssafy.travelcompass.domain.review.model.entity;

import com.ssafy.travelcompass.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_like_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_review_id", nullable = false)
    private TripReview tripReview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Builder
    public ReviewLike(TripReview tripReview, User user) {
        this.tripReview = tripReview;
        this.user = user;
    }
}
