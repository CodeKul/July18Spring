package com.codekul.july18spring.onetoone;

import jakarta.persistence.*;

@Entity
public class Adhar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long adharNumber;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(Long adharNumber) {
        this.adharNumber = adharNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
