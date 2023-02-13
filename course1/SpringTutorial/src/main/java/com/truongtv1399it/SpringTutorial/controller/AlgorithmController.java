package com.truongtv1399it.SpringTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmController {

    @GetMapping
    public String wellcome(){
        return "wellcome";
    }
}
