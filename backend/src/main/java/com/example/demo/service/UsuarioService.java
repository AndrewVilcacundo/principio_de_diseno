package com.example.demo.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public Usuario guardar(Usuario u) {
        return repo.save(u);
    }

    @Cacheable("usuarios")
    public List<Usuario> listar() {
        System.out.println("Consultando BD...");
        return repo.findAll();
    }
}