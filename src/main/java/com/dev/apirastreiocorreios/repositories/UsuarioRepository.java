package com.dev.apirastreiocorreios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.apirastreiocorreios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
