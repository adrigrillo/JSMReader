package com.example.jmsreader;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSListener {

    @JmsListener(containerFactory = "myFactory", destination = "${jms.destinationName}")
    public void receiveMessage(String msj) {
        System.out.println(msj);
    }
}