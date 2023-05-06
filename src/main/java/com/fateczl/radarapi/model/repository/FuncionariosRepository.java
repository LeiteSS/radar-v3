package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionario, Long> {
}
