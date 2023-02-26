package com.evoter.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

/**
 * @author showunmioludotun
 */
@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @SequenceGenerator(
            name = "vote_sequence",
            sequenceName = "vote_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vote_sequence"
    )

    private Integer id;
    private Integer userId;
    private Integer candidateId;
    private Integer pollId;
    private Date createdAt;

    public Vote(Integer id, Integer userId, Integer candidateId, Integer pollId, Date createdAt) {
        this.id = id;
        this.userId = userId;
        this.candidateId = candidateId;
        this.pollId = pollId;
        this.createdAt = createdAt;
    }

    public Vote() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
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
        Vote vote = (Vote) o;
        return Objects.equals(id, vote.id) && Objects.equals(userId, vote.userId) && Objects.equals(candidateId, vote.candidateId) && Objects.equals(pollId, vote.pollId) && Objects.equals(createdAt, vote.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, candidateId, pollId, createdAt);
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", userId=" + userId +
                ", candidateId=" + candidateId +
                ", pollId=" + pollId +
                ", createdAt=" + createdAt +
                '}';
    }
}
