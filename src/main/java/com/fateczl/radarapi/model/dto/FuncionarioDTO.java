package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Endereco;
import com.fateczl.radarapi.model.entities.Funcionario;

import javax.persistence.Column;
import javax.persistence.OneToOne;

public class FuncionarioDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String dataNascimento;
    private Endereco endereco;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(String nome, String sobrenome, String cpf, String email, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario toModel(FuncionarioDTO dto) {
        return new Funcionario(
                dto.getNome(),
                dto.getSobrenome(),
                dto.getCpf(),
                dto.getEmail(),
                dto.getDataNascimento(),
                dto.getEndereco()
        );
    }
}
