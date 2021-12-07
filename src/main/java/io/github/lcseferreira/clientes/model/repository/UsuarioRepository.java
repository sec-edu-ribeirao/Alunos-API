package io.github.lcseferreira.clientes.model.repository;

import io.github.lcseferreira.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);


    boolean existsByUsername(String username);
}
