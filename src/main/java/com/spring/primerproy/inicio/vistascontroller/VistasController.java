package com.spring.primerproy.inicio.vistascontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class VistasController {

    /*@RequestMapping("/saludo")
    public String saludo(){
        return "hola";
    }*/

    /*@RequestMapping("/saludo")
    public String saludo(Model model){
        model.addAttribute("nombre","Roberto");
        return "hola";
    }*/


    @RequestMapping(value="/users", method = GET)
    public ModelAndView saludo(){
        ModelAndView mav = new ModelAndView("hola");
        mav.addObject("nombre","Ruperto");
        return mav;
    }

    @GetMapping(value="/users/{id}")
    public String idreq(Model model , @PathVariable int id){
        model.addAttribute("id",id);
        return "hola-id";
    }

    @DeleteMapping("/users/{id}")
    public void iddel(){
        //Mi logica de negocio comienza aqui
    }







}
