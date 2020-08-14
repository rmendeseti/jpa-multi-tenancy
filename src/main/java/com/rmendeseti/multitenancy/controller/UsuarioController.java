package com.rmendeseti.multitenancy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.rmendeseti.multitenancy.model.Usuario;
import com.rmendeseti.multitenancy.service.impl.UsuarioService;

@RestController
@RequestScope
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> listarTodos(){
		return usuarioService.listarTodos();
	}
	
	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody Usuario usuario) {
		
		usuarioService.salvar(usuario);
		
		return ResponseEntity.ok().build();
		
	}
	
}
