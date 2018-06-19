package com.spring.primerproy.inicio.comidacontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class ComidaControl {
    @Autowired
    private ComidaService comidaService;

    //@RequestMapping(value = "/comida", method= GET)
    @GetMapping("/comida")
    public List<Comida> getAllComida(){
        return comidaService.getAllComida();
    }

    @GetMapping("/comida/{id}")
    public Comida getComida(@PathVariable int id){
        return comidaService.getComida(id);
    }

    @PostMapping("/comida")
    public void addComida(@RequestBody Comida comida){
        comidaService.addComida(comida);
    }


}
