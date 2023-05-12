package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.FamiliarDTO;
import com.fateczl.radarapi.model.entities.Familiar;
import com.fateczl.radarapi.model.services.FamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class FamiliaresController {

    @Autowired
    private FamiliaresService service;

    @PostMapping("/familiares")
    public ResponseEntity<Familiar> createFamiliar(@RequestBody FamiliarDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }


}
