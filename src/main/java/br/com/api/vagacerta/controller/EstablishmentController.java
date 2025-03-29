package br.com.api.vagacerta.controller;

import br.com.api.vagacerta.dto.request.EstablishmentRequestDTO;
import br.com.api.vagacerta.dto.response.EstablishmentResponseDTO;
import br.com.api.vagacerta.service.EstablishmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EstablishmentController {

    @Autowired
    private EstablishmentService service;

    @PostMapping("/create/establishment")
    @ResponseStatus(HttpStatus.CREATED)
    private EstablishmentResponseDTO create(@Valid @RequestBody EstablishmentRequestDTO dto) {
        return service.create(dto);
    }
}
