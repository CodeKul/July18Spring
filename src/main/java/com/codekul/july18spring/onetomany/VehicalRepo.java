package com.codekul.july18spring.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicalRepo extends JpaRepository<Vehicle,Long> {
}
