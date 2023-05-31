package com.fateczl.radarapi.model.repository;

import com.fateczl.radarapi.model.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionario, Long> {
    @Query("SELECT e FROM Funcionario e JOIN FETCH e.roles WHERE e.username = (:username)")
    public Funcionario findByUsername(@Param("username") String username);

    @Query("SELECT e FROM Funcionario e JOIN FETCH e.roles WHERE e.email = (:email)")
    public Funcionario findByEmail(@Param("email") String email);
}
