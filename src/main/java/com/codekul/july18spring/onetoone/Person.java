package com.codekul.july18spring.onetoone;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Adhar adhar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adhar getAdhar() {
        return adhar;
    }

    public void setAdhar(Adhar adhar) {
        this.adhar = adhar;
    }
}
