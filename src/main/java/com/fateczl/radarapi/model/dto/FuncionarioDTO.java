package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Funcionario;

import java.util.List;

public class FuncionarioDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String dataNascimento;
    private List<String> roles;
    private String username;
    private String password;
//private Endereco endereco;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(String nome, String sobrenome, String cpf, String email, String dataNascimento, List<String> roles, String username, String password) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.roles = roles;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /*public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }*/

    public Funcionario toModel(FuncionarioDTO dto) {
        return new Funcionario(
                dto.getNome(),
                dto.getSobrenome(),
                dto.getUsername(),
                dto.getCpf(),
                dto.getEmail(),
                dto.getDataNascimento(),
                dto.getRoles(),
                dto.getPassword()
        );
    }
}
