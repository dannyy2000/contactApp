package com.evoter.models;

import java.util.Date;
import java.util.Objects;

public class Poll {
    private Integer id;
    private Integer pollTypeId;
    private Integer candidateId;
    private Date pollDate;
    private Date createdAt;

    public Poll(Integer id, Integer pollTypeId, Integer candidateId, Date pollDate, Date createdAt) {
        this.id = id;
        this.pollTypeId = pollTypeId;
        this.candidateId = candidateId;
        this.pollDate = pollDate;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPollTypeId() {
        return pollTypeId;
    }

    public void setPollTypeId(Integer pollTypeId) {
        this.pollTypeId = pollTypeId;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public Date getPollDate() {
        return pollDate;
    }

    public void setPollDate(Date pollDate) {
        this.pollDate = pollDate;
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
        Poll poll = (Poll) o;
        return Objects.equals(id, poll.id) && Objects.equals(pollTypeId, poll.pollTypeId) && Objects.equals(candidateId, poll.candidateId) && Objects.equals(pollDate, poll.pollDate) && Objects.equals(createdAt, poll.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pollTypeId, candidateId, pollDate, createdAt);
    }

    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", pollTypeId=" + pollTypeId +
                ", candidateId=" + candidateId +
                ", pollDate=" + pollDate +
                ", createdAt=" + createdAt +
                '}';
    }
}
