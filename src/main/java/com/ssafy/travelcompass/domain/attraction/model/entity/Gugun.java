package com.ssafy.travelcompass.domain.attraction.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Gugun {

    @Id
    private int gugunCode;

    @Column(length = 30)
    private String gugunName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sido_code", nullable = false)
    private Sido sido;
}
