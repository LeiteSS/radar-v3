package com.fateczl.radarapi.controller;

import com.fateczl.radarapi.model.dto.DesaparecidoDTO;
import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.services.DesaparecidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class DesaparecidosController {
    @Autowired
    private DesaparecidosService service;

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @PostMapping("/desaparecidos")
    @MessageMapping("/ideia")
    @SendTo("/")
    public ResponseEntity<Desaparecido> save(@RequestBody DesaparecidoDTO dto) {
        Desaparecido desaparecido = service.save(dto);

        if (desaparecido != null) {
            // https://haseeamarathunga.medium.com/create-a-spring-boot-angular-websocket-using-sockjs-and-stomp-cb339f766a98
            simpMessagingTemplate.convertAndSend("/app", "Nova desaparecido cadastrado!");
        }

        return ResponseEntity.ok(desaparecido);
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
    public ResponseEntity<Desaparecido> update(@PathVariable Long id, @RequestBody DesaparecidoDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/desaparecidos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
