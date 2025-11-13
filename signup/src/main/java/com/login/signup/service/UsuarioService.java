package com.login.signup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.login.signup.dto.UsuarioRequestDTO;
import com.login.signup.dto.UsuarioResponseDTO;
import com.login.signup.entity.Usuario;
import com.login.signup.repository.UsuarioRepository;
@Service
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

// Serviço de cadastro de usuario
	public UsuarioResponseDTO saveUser(UsuarioRequestDTO userDTO) {
		Usuario usuario = new Usuario(userDTO.getName(), userDTO.getEmail(), userDTO.getPassword());
		usuario = usuarioRepository.save(usuario);
		UsuarioResponseDTO user = new UsuarioResponseDTO(usuario);
		return user;
	}

// Serviço de login de usuario
	public String login(UsuarioRequestDTO userDTO) {
		Usuario findUser = usuarioRepository.findByEmail(userDTO.getEmail());

		if (findUser == null) {
			return ("Usuário não encontrado");
		} else {
			if (findUser.getPassword().equals(userDTO.getPassword())) {
				return ("Logado com sucesso!");
			}
			return ("Essa senha pertence ao usuário com o email " + findUser.getEmail());
		}

	}

//	Serviço pra listar usuarios
	public List<UsuarioResponseDTO> listarUsuario() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioResponseDTO> listaDeUsuarios = new ArrayList<>();
		listaDeUsuarios = usuarios.stream().map(UsuarioResponseDTO::new).toList();
		return listaDeUsuarios;
	}

	/*
	 * public List<Usuario> listarUsuarios1() { List<Usuario> listaDeUsuarios =
	 * usuarioRepository.findAll(); return listaDeUsuarios; }
	 * 
	 * public List<Usuario> listarUsuarios() { return usuarioRepository.findAll(); }
	 */
	public Optional<Usuario> usuariosPorId(long id) {
		return usuarioRepository.findById(id);
	}

// Serviço de deletar usuarios por id
	public String deletar(Long id) {
		if (usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
//		204
			return ("Excluido com sucesso!");
		} else {
//		404
			return ("Esse id não existe");
		}
	}

//	Serviço pra atualizar usuarios
	public String atualizar(Long id, Usuario novo) {
		Optional<Usuario> UsuarioExistente = usuarioRepository.findById(id);

		if (UsuarioExistente.isPresent()) {
			Usuario Usuario = UsuarioExistente.get();
			Usuario.setName(novo.getName());
			Usuario.setPassword(novo.getPassword());
			usuarioRepository.save(Usuario);
			return String.format("O usuário %s foi atualizado com sucesso!", novo.getName());
		} else {
			return String.format("erro ao atualizar os dados do %s", novo.getName());
		}

	}

}
