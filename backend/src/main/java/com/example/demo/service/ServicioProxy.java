package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioProxy implements Servicio {

    private final ServicioReal real;

    public ServicioProxy(ServicioReal real) {
        this.real = real;
    }

    @Override
    public String ejecutar() {
        System.out.println("Antes (proxy)");
        String r = real.ejecutar();
        System.out.println("Después (proxy)");
        return r;
    }
}