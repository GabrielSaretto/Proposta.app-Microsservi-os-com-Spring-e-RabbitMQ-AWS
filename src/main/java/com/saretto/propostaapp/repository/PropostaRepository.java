package com.saretto.propostaapp.repository;

import com.saretto.propostaapp.entity.Proposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta, Long> {

    List<Proposta>findAllByIntegradaIsFalse();
}
