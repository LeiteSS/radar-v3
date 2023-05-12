package com.fateczl.radarapi.model.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Familiar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String grauDeParentesco;

    @Column(nullable = false)
    private LocalDate dataDeNascimento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "desaparecido_id")
    private Desaparecido desaparecido;


    public Familiar() {
    }

    public Familiar(Long id, String nome, String cpf, String email, String telefone, String grauDeParentesco, LocalDate dataDeNascimento, Desaparecido desaparecido) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.grauDeParentesco = grauDeParentesco;
        this.dataDeNascimento = dataDeNascimento;
        this.desaparecido = desaparecido;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public void setGrauDeParentesco(String grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Desaparecido getDesaparecido() {
        return desaparecido;
    }

    public void setDesaparecido(Desaparecido desaparecido) {
        this.desaparecido = desaparecido;
    }
}
