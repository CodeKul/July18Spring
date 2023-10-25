package com.codekul.july18spring.onetomany;

import com.codekul.july18spring.onetoone.Adhar;
import com.codekul.july18spring.onetoone.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private PartRepo partRepo;

    @Autowired
    private VehicalRepo vehicalRepo;

//    @PostMapping("saveVehicle")
//    private String saveVehicle(@RequestBody Vehicle vh){
//       var vehicle = new Vehicle();
//       vehicle.setName(vh.getName());
//       vehicle.setColor(vh.getColor());
//       vehicalRepo.save(vehicle);
//
//       vh.getParts().forEach(s->{
//           var parts = new Parts();
//           parts.setPartName(s.getPartName());
//           parts.setVehical(vehicle);
//           partRepo.save(parts);
//       });
//        return "vehicle saved.";
//
//    }
   @PostMapping("saveVehicle")
    private String saveVehicle(@RequestBody Vehicle vh){
        vehicalRepo.save(vh);
        return "vehicle saved.";
    }
}
