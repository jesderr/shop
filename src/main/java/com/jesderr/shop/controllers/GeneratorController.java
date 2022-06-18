package com.jesderr.shop.controllers;

import com.jesderr.shop.models.*;
import com.jesderr.shop.services.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("generator")
public class GeneratorController {

    private GeneratorService generatorService;

    public GeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping("fillData/{n}")
    public void fillData(@PathVariable int n) {
        this.generatorService.fillDataBase(n);
    }

}
