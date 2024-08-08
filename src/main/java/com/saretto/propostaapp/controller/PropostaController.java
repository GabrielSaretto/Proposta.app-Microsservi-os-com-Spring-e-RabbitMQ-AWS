package com.saretto.propostaapp.controller;

import com.saretto.propostaapp.dto.PropostaRequestDto;
import com.saretto.propostaapp.dto.PropostaResponseDto;
import com.saretto.propostaapp.service.PropostaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/proposta")
public class PropostaController {

    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDto> criar(@RequestBody PropostaRequestDto requestDto) {
        PropostaResponseDto response = propostaService.criar(requestDto);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.getId())
                .toUri()).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PropostaResponseDto>> obterProposta(){
        return ResponseEntity.ok(propostaService.obterProposta());
    }
}
