package com.spring.primerproy.inicio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hola desde Spring!";
    }

    @RequestMapping("/adios")
    public String adios(){
        return "Ya se acabó la clase :D";
    }

}
