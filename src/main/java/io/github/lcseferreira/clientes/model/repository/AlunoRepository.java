package io.github.lcseferreira.clientes.model.repository;

import io.github.lcseferreira.clientes.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
