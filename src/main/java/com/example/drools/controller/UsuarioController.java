package com.example.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.drools.entity.Usuario;
import com.example.drools.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/usuario")
	public Iterable<Usuario> getAll() {
		return usuarioRepository.findAll();
	}

}
