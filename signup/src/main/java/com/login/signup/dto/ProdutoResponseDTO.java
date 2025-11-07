package com.login.signup.dto;

import java.text.DecimalFormat;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.login.signup.entity.Produto;

@JsonPropertyOrder({"nome", "preco", "quantidade", "subTotal"})
public class ProdutoResponseDTO {
	private String nome;
	private double preco;
	private int quantidade;
	private double subTotal;
	
	public ProdutoResponseDTO(Produto prod, double subTotal) {
		this.nome = prod.getNome();
		this.preco = prod.getPreco();
		this.quantidade = prod.getQuantidade();
		this.subTotal = subTotal;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

    public String getSubTotal() {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        return df.format(subTotal);
    }


	
	
}
