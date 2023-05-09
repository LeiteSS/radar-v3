package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.FuncionarioDTO;
import com.fateczl.radarapi.model.entities.Funcionario;
import com.fateczl.radarapi.model.services.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class FuncionariosController {
    @Autowired
    private FuncionariosService service;

    @PostMapping("/funcionarios")
    public ResponseEntity<Funcionario> save(@RequestBody FuncionarioDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/funcionarios")
    public ResponseEntity<List<Funcionario>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/funcionarios/{id}")
    public ResponseEntity<Optional<Funcionario>> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getFuncionario(id));
    }

    @PutMapping("/funcionarios/{id}")
    public ResponseEntity<Funcionario> update(@PathVariable Long id, @RequestBody FuncionarioDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/funcionarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
