package org.pes.web_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doc")
public class DoctorAPI {
    // dependency injection
    @Autowired
    DoctorService doctorService;

    @PostMapping("/new")
    public ResponseEntity<String> callInsert(@RequestBody Doctor doctor){
        String res = doctorService.insert(doctor);
        return res.equals(doctor.getDoctorName()+" recruited")?
        ResponseEntity.status(HttpStatus.CREATED).body(res)
        :ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(res);
    }
}
