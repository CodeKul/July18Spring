package com.codekul.july18spring.onetomany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partName;

    @ManyToOne
    @JoinColumn(name = "vehical_id")
    @JsonBackReference
    private Vehicle vehical;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Vehicle getVehical() {
        return vehical;
    }

    public void setVehical(Vehicle vehical) {
        this.vehical = vehical;
    }
}
