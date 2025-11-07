package com.login.signup.dto;

import com.login.signup.entity.Usuario;

public class UsuarioResponseDTO {
	
	private long id;
	private String name;
	private String email;
	
	public UsuarioResponseDTO(Usuario user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	
}
