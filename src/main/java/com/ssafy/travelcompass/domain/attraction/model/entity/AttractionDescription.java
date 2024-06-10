package com.ssafy.travelcompass.domain.attraction.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AttractionDescription {

    @Id
    @Column(name = "content_id")
    private Long contentId;

    @Column(name = "homepage", length = 100)
    private String homepage;

    @Column(name = "overview", length = 10000)
    private String overview;

    @Column(name = "telname", length = 45)
    private String telname;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "content_id")
    private AttractionInfo attractionInfo;
}