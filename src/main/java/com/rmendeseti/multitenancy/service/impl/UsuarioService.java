package com.rmendeseti.multitenancy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmendeseti.multitenancy.model.Usuario;
import com.rmendeseti.multitenancy.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarTodos() {
		return usuarioRepository.findAll();
	}

	public void salvar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

}
