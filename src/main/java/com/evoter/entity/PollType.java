package com.evoter.entity;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * @author showunmioludotun
 */
@Entity
@Table(name = "poll_types")
public class PollType {

    @Id
    @SequenceGenerator(
            name = "poll_type_sequence",
            sequenceName = "poll_type_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "poll_type_sequence"
    )

    private Integer id;
    private String name;

    public PollType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PollType() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PollType pollType = (PollType) o;
        return Objects.equals(id, pollType.id) && Objects.equals(name, pollType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PollType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}