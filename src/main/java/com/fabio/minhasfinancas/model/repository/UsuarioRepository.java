package com.fabio.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//exists + By + [nome do campo da BD] : Select * from usuario where exists ()
	boolean existsByEmail(String email);
	
	//find + By + [nome do campo da BD] -- Spring executa a procura
	Optional<Usuario> findByEmail(String email);
	
}
