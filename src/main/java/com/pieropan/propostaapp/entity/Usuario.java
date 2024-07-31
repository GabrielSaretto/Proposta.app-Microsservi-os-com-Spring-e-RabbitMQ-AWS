package com.pieropan.propostaapp.entity;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sobremesa;

    private String cpf;

    private String telefone;

    private Double renda;

    private Proposta proposta;

    @OneToOne(mappedBy = "usuario")
    private Usuario usuario;

}
