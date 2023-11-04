package com.example.tuan4.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.tuan4.backend.enums.SkillLevel;
import com.example.tuan4.backend.ids.JobSkillID;

@Entity
@Table(name = "job_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JobSkillID.class)
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000)
    private String moreInfo;
}
