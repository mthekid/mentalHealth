package com.starlab.msa.mentalHealth.domain.stress;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "stress")
@ApiModel(value = "스트레스 검사 정보", description = "사용자 식별번호, 검사 날짜, 스트레스 검사지에 응답 정보를 가집니다.")
public class StressAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(value = "설문조사 식별번호", example = "1", required = true)
    private Long id;

    // 사용자 마이크로서비스에서 받아와야 한다.
    @Column(nullable = false)
    @ApiModelProperty(value = "사용자의 식별번호", example = "1", required = true)
    private Long userId;

    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(value = "설문조사 기록된 시간", required = true)
    private Date createDate;

    @Column(nullable = false)
    @ApiModelProperty(value = "문항 1", required = true)
    private int q1;

    @Column(nullable = false)
    @ApiModelProperty(value = "문항 2", required = true)
    private int q2;

    @Column(nullable = false)
    @ApiModelProperty(value = "문항 3", required = true)
    private int q3;

    @Column(nullable = false)
    @ApiModelProperty(value = "문항 4", required = true)
    private int q4;

    @Column(nullable = false)
    @ApiModelProperty(value = "문항 5", required = true)
    private int q5;

}
