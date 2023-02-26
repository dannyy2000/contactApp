package com.evoter.models;

import java.util.Date;
import java.util.Objects;

public class Candidate {
    private Integer id;
    private Integer partyId;
    private Integer pollTypeId;
    private String name;
    private String sex;
    private Integer age;
    private Date createdAt;

    public Candidate(Integer id, Integer partyId, Integer pollTypeId, String name, String sex, Integer age, Date createdAt) {
        this.id = id;
        this.partyId = partyId;
        this.pollTypeId = pollTypeId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getPollTypeId() {
        return pollTypeId;
    }

    public void setPollTypeId(Integer pollTypeId) {
        this.pollTypeId = pollTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(id, candidate.id) && Objects.equals(partyId, candidate.partyId) && Objects.equals(pollTypeId, candidate.pollTypeId) && Objects.equals(name, candidate.name) && Objects.equals(sex, candidate.sex) && Objects.equals(age, candidate.age) && Objects.equals(createdAt, candidate.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, partyId, pollTypeId, name, sex, age, createdAt);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", partyId=" + partyId +
                ", pollTypeId=" + pollTypeId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", createdAt=" + createdAt +
                '}';
    }
}
