package com.ssafy.travelcompass.domain.review.model.entity;

import java.time.LocalDateTime;

import com.ssafy.travelcompass.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_comment_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_review_id", nullable = false)
    private TripReview tripReview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_review_comment_id")
    private ReviewComment parentReviewComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 50)
    private String content;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Builder
    public ReviewComment(TripReview tripReview, ReviewComment parentReviewComment, User user, String content) {
        this.tripReview = tripReview;
        this.parentReviewComment = parentReviewComment;
        this.user = user;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }
}
