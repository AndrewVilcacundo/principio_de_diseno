package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioReal implements Servicio {

    @Override
    public String ejecutar() {
        return "Servicio real ejecutado";
    }
}