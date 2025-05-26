package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.UsuarioService;

@SpringBootApplication
public class DondesalgoApplication implements CommandLineRunner{
	
	@Autowired
	UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(DondesalgoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Print desde Springboot");
//		usuarioService.registrarUsuario(42411691, "Nacho Dorigo", "nachodorigo@gmail.com", 25);
	}


}
