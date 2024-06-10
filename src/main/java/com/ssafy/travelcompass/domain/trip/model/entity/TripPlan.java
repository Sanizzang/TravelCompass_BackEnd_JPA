package com.ssafy.travelcompass.domain.trip.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TripPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_plan_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trip_detail_id", nullable = false)
    private TripDetail tripDetail;

    @Column(nullable = false)
    private LocalDate tripDate;
}
