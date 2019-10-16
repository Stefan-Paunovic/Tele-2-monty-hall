package se.comhem.test.montyhall.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class HealthController {

    @GetMapping(value = "/health")
    public ResponseEntity healthCheck(){
        return ResponseEntity.ok("Up and running!");
    }
}
