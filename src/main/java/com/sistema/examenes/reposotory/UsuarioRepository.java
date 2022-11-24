package com.sistema.examenes.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);

}
