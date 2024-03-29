package com.luana.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luana.projeto.dto.UsuarioDTO;
import com.luana.projeto.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")

public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<UsuarioDTO> listarTodos(){
		return usuarioService.listarTodos();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public void inserir(@RequestBody UsuarioDTO usuario) {
		usuarioService.inserirUsuario(usuario);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping
	public UsuarioDTO alterar(@RequestBody UsuarioDTO usuario) {
		return usuarioService.alterarUsuario(usuario);
	}
	
	//exemplo - http://endereco-front/usuario/3
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		usuarioService.excluirUsuario(id);
		return ResponseEntity.ok().build();
	}
	
}
