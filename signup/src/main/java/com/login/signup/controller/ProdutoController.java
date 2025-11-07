package com.login.signup.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.signup.dto.ProdutoRequestDTO;
import com.login.signup.dto.ProdutoResponseDTO;
import com.login.signup.entity.Produto;
import com.login.signup.repository.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("produto")
public class ProdutoController {
//////////////////// Injeção de dependências ////////////////////
	@Autowired
	ProdutoRepository produtoRepository;

//////////////////// Mostrando um produto pelo id ////////////////////
	@GetMapping("mostrar/id/{id}")
	public ResponseEntity<?> buscarId(@PathVariable long id) {

		Optional<Produto> produto = produtoRepository.findById(id);

		if (produto.isPresent()) {
			return ResponseEntity.ok(produto);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
		}

	}

//////////////////// mostrar todos os produtos ////////////////////
	@GetMapping(value = "lambida")
	public List<ProdutoResponseDTO> listarProdutos0(){
		List<Produto> produtos = produtoRepository.findAll();
		List<ProdutoResponseDTO> listaDeProdutos = new ArrayList<>();
		listaDeProdutos = produtos.stream().map(prod -> new ProdutoResponseDTO(prod, prod.getQuantidade() * prod.getPreco())).toList();
		return listaDeProdutos;
	}
	
	@GetMapping("/mostrar/todos")
	public ResponseEntity<?> buscarTodos() {
		List<Produto> lista = produtoRepository.findAll();
		return ResponseEntity.ok(lista);
	}
//////////////////// Criar produto ////////////////////

	@PostMapping("/criar")
	public ResponseEntity<?> criarProduto(@Valid @RequestBody ProdutoRequestDTO produto) {
		Produto novo = new Produto(produto.getNome(), produto.getPreco(), produto.getQuantidade());
		novo = produtoRepository.save(novo);
		return ResponseEntity.ok(novo);
	}

//////////////////// Deletando produtos ////////////////////

	@DeleteMapping("deletar/{id}")
	public ResponseEntity<?> deletar(@PathVariable long id) {
		if (produtoRepository.existsById(id)) {
			produtoRepository.deleteById(id);
//		204
			return ResponseEntity.status(HttpStatus.OK).body("Produto excluido com sucesso!");
		} else {
//		404
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse id não existe");
		}
	}

//////////////////// Alterar produto ////////////////////
	@PutMapping("atualizar/{id}")
	public ResponseEntity<?> atualizar(@PathVariable long id, @RequestBody Produto produto) {
		Optional<Produto> novo = produtoRepository.findById(id);

		if (novo.isPresent()) {
			Produto e = novo.get();
			e.setQuantidade(produto.getQuantidade());
			produtoRepository.save(e);
			return ResponseEntity.ok(novo);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse id não existe");
		}

	}

}
