package com.example.acxiomchallenge.controller;
import com.example.acxiomchallenge.repository.AppsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/apps")
public class AppsController {

    AppsRepository appsRepository;

    public AppsController(AppsRepository appsRepository) {
        this.appsRepository = appsRepository;
    }

    @GetMapping
    public List<?> getAll() {
        return appsRepository.findAll();
    }
}



