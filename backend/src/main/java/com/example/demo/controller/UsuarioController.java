package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.service.ServicioProxy;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;
    private final ServicioProxy proxy;

    public UsuarioController(UsuarioService service, ServicioProxy proxy) {
        this.service = service;
        this.proxy = proxy;
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario u) {
        return service.guardar(u);
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @GetMapping("/proxy")
    public String probarProxy() {
        return proxy.ejecutar();
    }
}