package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.LoginDTO;
import com.fateczl.radarapi.model.dto.TokenDTO;
import com.fateczl.radarapi.model.services.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {
    @Autowired
    private FuncionariosService service;

    @PostMapping("/login")
    public ResponseEntity<TokenDTO> signIn(@RequestBody LoginDTO dto) {
        System.out.println("Me chamou");
        return ResponseEntity.ok(service.signIn(dto));
    }
}
