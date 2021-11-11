package com.starlab.msa.mentalHealth.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "stress")
@ApiModel(value = "스트레스 검사 정보", description = "사용자 식별번호, 스트레스 검사지에 대한 전체 정보를 가집니다.")
public class StressInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(value = "설문조사 식별번호", example = "1", required = true)
    private Long id;

    @Column(nullable = false)
    @ApiModelProperty(value = "사용자의 식별번호", example = "1", required = true)
    private Long userId;

    @OneToOne
    @JoinColumn(name="stressQuestionnaireId")
    @ApiModelProperty(value = "설문조사 응답표", required = true)
    private StressQuestionnaire stressQuestionnaire;

    @ApiModelProperty(value = "설문조사에 정보[기준, 표준, 참조]", example = "보건복지부 표준", required = true)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(value = "설문조사 기록된 시간", required = true)
    private Date createDate;

}
