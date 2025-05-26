package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/springcito")
public class Controller {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Usuario usuario) {
		String respuesta = usuarioService.registrarUsuario(usuario.getDni(), usuario.getNombre(), usuario.getEmail(),
				usuario.getEdad());
		if (respuesta.equals("Usuario registrado correctamente")) {
			return ResponseEntity.ok(respuesta);
		} else {
			return ResponseEntity.badRequest().body(respuesta);
		}
	}

}
