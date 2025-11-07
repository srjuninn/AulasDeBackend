package com.login.signup.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
	@NotNull
	@NotBlank(message = "O nome não pode ser em nulo nem em branco")
	private String name;
	@Email
	@NotBlank(message = "Você tá fazendo cagada paizão")
	private String email;
	@Size(min = 6, max = 20, message = "A senha deve ter entre 6 a 20 caracteres calabreso")
	private String password;

	public UsuarioRequestDTO(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public UsuarioRequestDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
