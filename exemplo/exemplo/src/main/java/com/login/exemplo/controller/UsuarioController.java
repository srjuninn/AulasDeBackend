package com.login.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.exemplo.entity.Usuario;
import com.login.exemplo.repository.UsuarioRepository;

@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@PostMapping(value = "usuario/cadastro")
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario user) {
		Usuario usuario = new Usuario(user.getName(), user.getEmail(), user.getPassword());
		usuario = usuarioRepository.save(usuario);
		return ResponseEntity.ok(usuario);
	}

	@PostMapping(value = "login")
	public ResponseEntity<?> login(@RequestBody Usuario user) {
		Usuario findUser = usuarioRepository.findByEmail(user.getEmail());

		if (findUser == null) {
			return ResponseEntity.ok("Usuário não encontrado");
		} else {
			if (findUser.getPassword().equals(user.getPassword())) {
				return ResponseEntity.ok("Logado com sucesso!");
			}
//			this isnt for production men OMG gay!
			return ResponseEntity.ok("Essa senha pertence ao usuário com o email " + findUser.getEmail());
		}

	}
//	Listando os usuarios por meio de um get
	
	@GetMapping(value = "fiama")
	public List<Usuario> listarUsuarios1() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAll();
		return listaDeUsuarios;
	}

	@GetMapping(value = "vitinho")
	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}
	
//	Buscando um usuário por id com o parâmetro id no valor da url
	@GetMapping(value = "{id}")
//	é um optional porque pode existir ou não esse id
	public Optional<Usuario> usuariosPorId(@PathVariable long id) {
		return usuarioRepository.findById(id);
	}
//	deletando um usuario pelo id
	@DeleteMapping(value = "{id}")
	public void deletarId(@PathVariable long id){
		 usuarioRepository.deleteById(id);
//		 System.out.println("Usuário excluido com sucesso");
	}
}
