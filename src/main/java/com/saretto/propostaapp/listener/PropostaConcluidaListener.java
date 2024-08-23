package com.saretto.propostaapp.listener;

import com.saretto.propostaapp.dto.PropostaResponseDto;
import com.saretto.propostaapp.entity.Proposta;
import com.saretto.propostaapp.mapper.PropostaMapper;
import com.saretto.propostaapp.repository.PropostaRepository;
import com.saretto.propostaapp.service.WebSocketService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PropostaConcluidaListener {

    private PropostaRepository propostaRepository;

    private WebSocketService webSocketService;

    @RabbitListener(queues = "${rabbitmq.queue.proposta.concluida}")
    public void propostaConcluida(Proposta proposta) {
        propostaRepository.save(proposta);
        PropostaResponseDto responseDto = PropostaMapper.INSTANCE.convertEntityToDto(proposta);
        webSocketService.notificar(responseDto);
    }
}