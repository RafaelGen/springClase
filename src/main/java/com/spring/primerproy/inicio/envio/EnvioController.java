package com.spring.primerproy.inicio.envio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EnvioController {

    //Quiero crear una instancia de aereo y terrestre
    /*Aereo aer = new Aereo();
    Terrestre terr = new Terrestre();*/


    private IEnvioPaquete envioPaquete;

    public EnvioController(IEnvioPaquete terrestre){
        this.envioPaquete = terrestre;
    }

    @Autowired
    private IEnvioPaquete aereo;

    @Autowired
    private IEnvioPaquete terrestre;


    @RequestMapping("/aer")
    @ResponseBody
    public String aer(){
        aereo.enviar("John","Las Bahamas");
        return "Enviado de forma aerea";
    }

    @RequestMapping("/terr")
    @ResponseBody
    public String terr(){
        terrestre.enviar("Mary","Miami");
        return "Enviado de forma terrestre";
    }

    @RequestMapping("/envio")
    @ResponseBody
    public String envio(){
        envioPaquete.enviar("Mary","Miami");
        return "Enviado de cualquier forma";
    }


}
