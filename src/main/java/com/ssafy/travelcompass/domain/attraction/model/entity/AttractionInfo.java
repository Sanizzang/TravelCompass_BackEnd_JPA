package com.ssafy.travelcompass.domain.attraction.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class AttractionInfo {

    @Id
    private int contentId;

    private Integer contentTypeId;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String addr1;

    @Column(length = 50)
    private String addr2;

    @Column(length = 50)
    private String zipcode;

    @Column(length = 50)
    private String tel;

    @Column(length = 200)
    private String firstImage;

    @Column(length = 200)
    private String firstImage2;

    private Integer readcount;

    private Integer sidoCode;

    private Integer gugunCode;

    @Column(precision = 20, scale = 17)
    private Double latitude;

    @Column(precision = 20, scale = 17)
    private Double longitude;

    @Column(length = 2)
    private String mlevel;
}