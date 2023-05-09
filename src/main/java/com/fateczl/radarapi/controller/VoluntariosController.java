package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.VoluntarioDTO;
import com.fateczl.radarapi.model.entities.Voluntario;
import com.fateczl.radarapi.model.services.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin allow everyone
@CrossOrigin("*")
@RequestMapping("/api/v1/voluntarios")
public class VoluntariosController{

    @Autowired
    private VoluntarioService service;

    @PostMapping("/voluntarios")
    public ResponseEntity<Voluntario> save(@RequestBody VoluntarioDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/voluntarios")
    public ResponseEntity<List<Voluntario>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/voluntarios/{id}")
    public ResponseEntity<Optional<Voluntario>> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getVoluntario(id));
    }

    @PutMapping("/voluntarios/{id}")
    public ResponseEntity<Voluntario> update(@PathVariable Long id, @RequestBody VoluntarioDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/voluntarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
