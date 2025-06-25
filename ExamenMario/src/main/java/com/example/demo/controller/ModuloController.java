package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ModuloRequest;
import com.example.demo.dto.ModuloResponse;
import com.example.demo.service.ModuloService;

@RestController
@RequestMapping("/api/modulo")
public class ModuloController {

    private final ModuloService moduloService;

    public ModuloController(ModuloService moduloService) {
        this.moduloService = moduloService;
    }

    @PostMapping
    public ModuloResponse calculate(@RequestBody ModuloRequest request) {
        long result = moduloService.calculate(request.x(), request.y(), request.n());
        return new ModuloResponse(result);
    }
}
