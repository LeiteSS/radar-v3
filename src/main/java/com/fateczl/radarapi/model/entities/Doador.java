package com.fateczl.radarapi.model.entities;

import javax.persistence.*;

@Entity
public class Doador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDoador;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String cpf;

    @OneToOne
    private Endereco endereco;

    @Column(nullable = false)
    private Double valor;


    public Doador() {
    }

    public Doador(Long idDoador, String nome, String sobrenome, String cpf, Endereco endereco, Double valor) {
        this.idDoador = idDoador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.valor = valor;
    }

    public Doador(String nome, String sobrenome, String cpf, Endereco endereco, Double valor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.valor = valor;
    }

    public Long getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(Long idDoador) {
        this.idDoador = idDoador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
