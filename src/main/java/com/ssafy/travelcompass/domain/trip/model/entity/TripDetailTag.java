package com.ssafy.travelcompass.domain.trip.model.entity;

import jakarta.persistence.*;

@Entity
public class TripDetailTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_detail_tag_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_detail_id", nullable = false)
    private TripDetail tripDetail;

    @Column(nullable = false, length = 10)
    private String tag;
}
