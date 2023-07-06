package com.nva.itmoabitfetcher.entity;

import io.crnk.core.resource.annotations.JsonApiResource;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.UUID;

@Data
@Entity
@JsonApiResource(type = "applications", resourcePath = "applications")
@Table(name = "applications", schema = "itmo_abit_fetcher", catalog = "itmo-abit-fetcher")
public class Application {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private UUID id;

    @Basic
    @Column(name = "contest")
    private String contest;

    @Basic
    @Column(name = "exam_type")
    private String examType;

    @Basic
    @Column(name = "diploma_average")
    private BigInteger diplomaAverage;

    @Basic
    @Column(name = "position")
    private Integer position;

    @Basic
    @Column(name = "priority")
    private Integer priority;

    @Basic
    @Column(name = "ia_scores")
    private BigInteger iaScores;

    @Basic
    @Column(name = "exam_scores")
    private BigInteger examScores;

    @Basic
    @Column(name = "send_agreement")
    private Integer sendAgreement;

    @Basic
    @Column(name = "total_scores")
    private BigInteger totalScores;

    @Basic
    @Column(name = "is_send_original")
    private Boolean isSendOriginal;

    @Basic
    @Column(name = "snils")
    private String snils;

    @Basic
    @Column(name = "case_number")
    private String caseNumber;

    @Basic
    @Column(name = "status")
    private String status;

    @Basic
    @Column(name = "educational_program_id")
    private UUID educationalProgramId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY, targetEntity = EducationalProgram.class)
    @JoinColumn(name = "educational_program_id", columnDefinition = "uuid",
            nullable = false, insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "applications_educational_programs_id_fk"))
    private EducationalProgram educationalProgram;
}
