package com.spring.primerproy.inicio.envio;

import org.springframework.stereotype.Component;

//@Component
public class Aereo implements IEnvioPaquete{

    @Override
    public void enviar(String destinatario, String destino){
        System.out.println("Se envía de forma aerea a: " + destinatario);
        System.out.println("Ubicado en: " + destino);
    }

}
