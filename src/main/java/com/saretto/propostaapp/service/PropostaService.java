package com.saretto.propostaapp.service;

import com.saretto.propostaapp.dto.PropostaRequestDto;
import com.saretto.propostaapp.dto.PropostaResponseDto;
import com.saretto.propostaapp.entity.Proposta;
import com.saretto.propostaapp.mapper.PropostaMapper;
import com.saretto.propostaapp.repository.PropostaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto){
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(requestDto);
        propostaRepository.save(proposta);

        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }
}
