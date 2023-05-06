package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecosRepository extends JpaRepository<Endereco, Long> {
}
