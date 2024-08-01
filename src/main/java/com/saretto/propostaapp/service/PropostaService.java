package com.saretto.propostaapp.service;

import com.saretto.propostaapp.dto.PropostaRequestDto;
import com.saretto.propostaapp.dto.PropostaResponseDto;
import com.saretto.propostaapp.repository.PropostaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto){
        propostaRepository.save();
        return null;
    }
}
