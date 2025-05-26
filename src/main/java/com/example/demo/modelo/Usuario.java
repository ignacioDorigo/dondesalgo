package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	private Integer dni;
	private String nombre;
	private String email;
	private Integer edad;

	public Usuario() {

	}

	public Usuario(Integer dni, String nombre, String email, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
