package com.ssafy.travelcompass.domain.attraction.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AttractionDetail {

    @Id
    private Long contentId;

    @Column(length = 3)
    private String cat1;

    @Column(length = 5)
    private String cat2;

    @Column(length = 9)
    private String cat3;

    @Column(length = 14)
    private String createdTime;

    @Column(length = 14)
    private String modifiedTime;

    @Column(length = 5)
    private String booktour;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "content_id")
    private AttractionInfo attractionInfo;
}