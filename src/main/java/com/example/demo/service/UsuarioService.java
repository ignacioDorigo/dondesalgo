package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public String registrarUsuario(Integer dni, String nombre, String email, Integer edad) {
		Optional<Usuario> usuarioOptional = usuarioRepository.findById(dni);
		if (usuarioOptional.isEmpty()) {
			Usuario usuarioNuevo = new Usuario(dni, nombre, email, edad);
			usuarioRepository.save(usuarioNuevo);
			return "Usuario registrado correctamente";

		} else {
			return "Usuario ya registrado";
		}
	}

}
