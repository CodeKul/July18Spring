package com.codekul.july18spring.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepo extends JpaRepository<Parts,Long> {
}
