package com.luana.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luana.projeto.dto.UsuarioDTO;
import com.luana.projeto.entity.UsuarioEntity;
import com.luana.projeto.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	//READ
	public List<UsuarioDTO> listarTodos(){
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO:: new).toList();	
	}// o stream percorre o array, cria um  UsuarioDTO baseado no array usuarios e o retorna em lista
	
	
	//CREATE
	public void inserirUsuario(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		usuarioRepository.save(usuarioEntity);
	}
	
	
	//UPDATE - usa-se a mesma função save mas como o id já existe irá apenas atualizar.
	public UsuarioDTO alterarUsuario(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		usuarioRepository.save(usuarioEntity);
		return new UsuarioDTO(usuarioRepository.save(usuarioEntity));
	}
	
	
	//DELETE/EXCLUIR - busca pelo id e deleta
	public void excluirUsuario(Long id) {
		UsuarioEntity usuarioEntity = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuarioEntity);
	}
	
	
}
