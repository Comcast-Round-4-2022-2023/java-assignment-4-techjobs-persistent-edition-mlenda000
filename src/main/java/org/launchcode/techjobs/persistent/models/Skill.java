package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs= new ArrayList<>();
    @ManyToMany(mappedBy = "jobs")
    private List<Skill> skill = new ArrayList<>();

    @NotBlank
    @NotNull
    @Size(min=5, max = 300)
    private String description;
    public Skill() {
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Skill> getSkills() {
        return skill;
    }

    public void setSkills(List<Skill> skills) {
        this.skill = skills;
    }

    @Override
    public String toString() {
        return skill.toString();
    }
}