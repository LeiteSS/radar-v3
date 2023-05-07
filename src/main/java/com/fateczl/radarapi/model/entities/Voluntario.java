package com.fateczl.radarapi.model.entities;

import javax.persistence.*;

public class Voluntario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String cpf;

    @OneToOne
    private Endereco endereco;

    @Column(nullable = false)
    private boolean condicoes;

    @Column(nullable = false)
    private boolean legitimidade;

    public Voluntario() {
    }

    public Voluntario(Long id, String nome, String sobrenome, String dataNascimento, String email, String telefone, String cpf, Endereco endereco, boolean condicoes, boolean legitimidade) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.condicoes = condicoes;
        this.legitimidade = legitimidade;
    }

    public Voluntario(String nome, String sobrenome, String dataNascimento, String email, String telefone, String cpf, Endereco endereco, boolean condicoes, boolean legitimidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.condicoes = condicoes;
        this.legitimidade = legitimidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public boolean isCondicoes() {
        return condicoes;
    }

    public void setCondicoes(boolean condicoes) {
        this.condicoes = condicoes;
    }

    public boolean isLegitimidade() {
        return legitimidade;
    }

    public void setLegitimidade(boolean legitimidade) {
        this.legitimidade = legitimidade;
    }
}
