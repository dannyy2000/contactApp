package com.evoter.entity;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * @author showunmioludotun
 */
@Entity
@Table(name = "parties")
public class Party {

    @Id
    @SequenceGenerator(
            name = "party_sequence",
            sequenceName = "party_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "party_sequence"
    )

    private Integer id;
    private String name;
    private String logo;

    public Party() {

    }
    public Party(Integer id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Party party = (Party) o;
        return Objects.equals(id, party.id) && Objects.equals(name, party.name) && Objects.equals(logo, party.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, logo);
    }

    @Override
    public String toString() {
        return "Party{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
