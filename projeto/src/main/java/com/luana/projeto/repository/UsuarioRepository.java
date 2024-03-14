package com.luana.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luana.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
