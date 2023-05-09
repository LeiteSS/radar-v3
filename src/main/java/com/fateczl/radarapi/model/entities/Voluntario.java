package com.fateczl.radarapi.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "Voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_voluntario")
    private Long idVoluntario;

    @Column(nullable = false)
    private String emailVoluntario;

    @Column(nullable = false)
    private String nomeVoluntario;

    @Column(nullable = false)
    private String sobrenomeVoluntario;

    @OneToOne
    private Endereco endereco;

    @Column(nullable = false)
    private String cpfVoluntario;

    @Column(name = "telefone")
    private String telefoneVoluntario;

    public Voluntario() {
    }

    public Voluntario(Long idVoluntario, String nomeVoluntario, String sobrenomeVoluntario, String emailVoluntario, String telefoneVoluntario, String cpfVoluntario, Endereco endereco) {
        
        this.idVoluntario = idVoluntario;
        this.nomeVoluntario = nomeVoluntario;
        this.sobrenomeVoluntario = sobrenomeVoluntario;
        this.cpfVoluntario = cpfVoluntario;
        this.emailVoluntario = emailVoluntario;
        this.telefoneVoluntario = telefoneVoluntario;
        this.endereco = endereco;
        
    }

    public Voluntario(String nomeVoluntario, String sobrenomeVoluntario, String emailVoluntario, String telefoneVoluntario, String cpfVoluntario, Endereco endereco) {
        
        this.nomeVoluntario = nomeVoluntario;
        this.sobrenomeVoluntario = sobrenomeVoluntario;
        this.cpfVoluntario = cpfVoluntario;
        this.emailVoluntario = emailVoluntario;
        this.telefoneVoluntario = telefoneVoluntario;
        this.endereco = endereco;
        
    }
  
    public Long getIdVoluntario() {
        return idVoluntario;
    }

    public void setIdVoluntario(Long idVoluntario) {
        this.idVoluntario = idVoluntario;
    }

    public String getNomeVoluntario() {
        return nomeVoluntario;
    }

    public void setNomeVoluntario(String nomeVoluntario) {
        this.nomeVoluntario = nomeVoluntario;
    }

    public String getSobreNomeVoluntario() {
        return sobrenomeVoluntario;
    }

    public void setSobreNomeVoluntario(String sobrenomeVoluntario) {
        this.sobrenomeVoluntario = sobrenomeVoluntario;
    }

    
    public String getCpfVoluntario() {
        return cpfVoluntario;
    }

    public void setCpfVoluntario(String cpfVoluntario) {
        this.cpfVoluntario = cpfVoluntario;
    }

    public String getTelefoneVoluntario() {
        return telefoneVoluntario;
    }

    public void setTelefoneVoluntario(String telefoneVoluntario) {
        this.telefoneVoluntario = telefoneVoluntario;
    }

    public String getEmailVoluntario() {
        return emailVoluntario;
    }

    public void setEmailVoluntario(String emailVoluntario) {
        this.emailVoluntario = emailVoluntario;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco enderecoDTO) {
        this.endereco = enderecoDTO;
    }
}
