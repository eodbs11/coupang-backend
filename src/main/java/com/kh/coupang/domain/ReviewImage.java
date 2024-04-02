package com.kh.coupang.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
// 테이블에도 _ 들어가면 인식 안됨 컬럼명 맞추는 것과 동일
@Table(name = "review_image")
public class ReviewImage {

    @Id
    @Column(name = "revi_img_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviImgCode;

    // 리뷰게시판에 들어가는 사진 관련 vo를 분리시킨거니까
    @ManyToOne
    @JoinColumn(name="revi_code")
    @JsonIgnore
    private Review review;

    @Column(name = "revi_url")
    private String reviUrl;

}
