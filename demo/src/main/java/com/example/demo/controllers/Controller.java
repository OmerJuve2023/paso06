package com.example.demo.controllers;

import com.example.demo.Interface.Repository;
import com.example.demo.intities.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Repository repository;
    private final Logger log = LoggerFactory.getLogger(Repository.class);
    private final ResponseEntity<Object> bad = ResponseEntity.badRequest().build();

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @Value("${app.message}")
    String message;

    @GetMapping("auto/view/all")
    public ResponseEntity<Object> findAllAuto() {
        if (repository.count() == 0) {
            log.warn("data null");
            return bad;
        } else {
            log.warn("succesfull execution");
            return ResponseEntity.ok(repository.findAll());
        }
    }

    @GetMapping("auto/create/one")
    public String createData() {
        Auto auto = new Auto();
        auto.setColor("blanco");
        auto.setMarca("Susuki");
        auto.setModelo("elantra");
        auto.setSerieMotor("15484fg");
        auto.setNumeroPuertas("4");
        repository.save(auto);
        return message;
    }


}
