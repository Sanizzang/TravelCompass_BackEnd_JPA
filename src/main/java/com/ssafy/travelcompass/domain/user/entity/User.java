package com.ssafy.travelcompass.domain.user.entity;

import com.ssafy.travelcompass.domain.user.enums.Gender;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "nickname")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(nullable = false, length = 45)
    private String password;

    @Column(nullable = false, length = 45)
    private String username;

    @Column(nullable = false, length = 45)
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private LocalDate birthday;

    @Column(nullable = false, length = 45)
    private String introduction;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int totalStar;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int totalStarCount;

    @Column(length = 45)
    private String refreshToken;

    @Builder
    public User(final Long id, final String email, final String password, final String username, final Gender gender, final LocalDate birthday, final String introduction, final int totalStar, final int totalStarCount, final String refreshToken) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.introduction = introduction;
        this.totalStar = totalStar;
        this.totalStarCount = totalStarCount;
        this.refreshToken = refreshToken;
    }
}
