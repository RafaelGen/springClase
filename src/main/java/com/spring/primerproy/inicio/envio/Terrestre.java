package com.spring.primerproy.inicio.envio;

import org.springframework.stereotype.Component;


public class Terrestre implements IEnvioPaquete{

    @Override
    public void enviar(String destinatario, String destino){
        System.out.println("Se envía de forma terrestre a: " + destinatario);
        System.out.println("Ubicado en: " + destino);
    }
}
