package com.login.signup.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ProdutoRequestDTO {
	@NotNull(message = "tu é burro ou se faz...campo nulo")
	@NotBlank(message = "tu é burro ou se faz...campo em branco")
	private String nome;
	@NotNull(message = "o preço não pode ser nulo...cabaço")
	@Positive(message = "preço menor ou = a zero ??? ta maluko")
	@DecimalMax("150")
	private double preco;
	@NotNull(message = "tu tem quantidades nula do produto ?")
	@PositiveOrZero(message = "ta podendo ter quantidade negativa ?")
	private int quantidade;
	
	public ProdutoRequestDTO(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public ProdutoRequestDTO() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
