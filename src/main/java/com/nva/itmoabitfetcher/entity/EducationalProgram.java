package com.nva.itmoabitfetcher.entity;

import io.crnk.core.resource.annotations.JsonApiResource;
import javax.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@JsonApiResource(type = "educational-programs", resourcePath = "educational-programs")
@Table(name = "educational_programs", schema = "itmo_abit_fetcher", catalog = "itmo-abit-fetcher")
public class EducationalProgram {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private UUID id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "full_name")
    private String fullName;

    @Basic
    @Column(name = "budget_quota")
    private int budgetQuota;

    @Basic
    @Column(name = "contract_quota")
    private int contractQuota;

    @Basic
    @Column(name = "special_quota")
    private int specialQuota;

    @Basic
    @Column(name = "target_reception")
    private Integer targetReception;

    @Basic
    @Column(name = "isu_id")
    private Integer isuId;
}
