package com.pieropan.propostaapp.entity;

import jakarta.persistence.*;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorSolicitade;

    private int prazoPagamento;

    private Boolean aprovada;

    private boolean integrada;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
