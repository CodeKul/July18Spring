package com.codekul.july18spring.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicalRepo extends JpaRepository<Vehicle,Long> {

    @Query(value = "select * from fn_get_vehicle_list()",nativeQuery = true)
    List<Vehicle> getVehicleList();
}
