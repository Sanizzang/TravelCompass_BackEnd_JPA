package com.ssafy.travelcompass.domain.trip.model.entity;

import com.ssafy.travelcompass.domain.attraction.model.entity.Sido;
import com.ssafy.travelcompass.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TripDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_detail_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    private String content;

    private LocalDate startDate;

    private LocalDate endDate;

    private int maxCapacity;

    private int view;

    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "sido_code")
    private Sido sido;
}
