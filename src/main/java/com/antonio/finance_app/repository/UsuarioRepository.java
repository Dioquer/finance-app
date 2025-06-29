package com.antonio.finance_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.finance_app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
