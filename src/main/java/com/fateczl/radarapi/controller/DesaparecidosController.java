package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.DesaparecidoDTO;
import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.services.DesaparecidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class DesaparecidosController {
    @Autowired
    private DesaparecidosService service;

    @PostMapping("/desaparecidos")
    public ResponseEntity<Desaparecido> save(@RequestBody Desaparecido dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/desaparecidos")
    public ResponseEntity<List<Desaparecido>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/desaparecidos/{id}")
    public ResponseEntity<Optional<Desaparecido>> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getDesaparecido(id));
    }

    @PutMapping("/desaparecidos/{id}")
    public ResponseEntity<Desaparecido> update(@PathVariable Long id, @RequestBody Desaparecido dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/desaparecidos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
