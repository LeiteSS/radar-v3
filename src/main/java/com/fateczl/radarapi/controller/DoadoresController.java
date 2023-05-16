package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.DoadorDTO;
import com.fateczl.radarapi.model.entities.Doador;
import com.fateczl.radarapi.model.services.DoadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class DoadoresController {
    @Autowired
    private DoadoresService service;

    @PostMapping("/doadores")
    public ResponseEntity<Doador> save(@RequestBody DoadorDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/doadores")
    public ResponseEntity<List<Doador>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/doadores/{id}")
    public ResponseEntity<Optional<Doador>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/doadores/{id}")
    public ResponseEntity<Doador> update(@PathVariable Long id, @RequestBody DoadorDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/doadores/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
