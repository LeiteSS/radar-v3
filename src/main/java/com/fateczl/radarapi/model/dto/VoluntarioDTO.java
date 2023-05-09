package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Voluntario;
import com.fateczl.radarapi.model.entities.Endereco;

public class VoluntarioDTO {
    private String nomeVoluntario;
    private String sobrenomeVoluntario;
    private String cpfVoluntario;
    private String emailVoluntario;
    private String telefoneVoluntario;
    private Endereco enderecoDTO;


    public VoluntarioDTO() {
    }

    public VoluntarioDTO(String nomeVoluntario, String sobrenomeVoluntario, String cpfVoluntario, String emailVoluntario, String telefoneVoluntario, Endereco enderecoDTO) {
        this.nomeVoluntario = nomeVoluntario;
        this.sobrenomeVoluntario = sobrenomeVoluntario;
        this.cpfVoluntario = cpfVoluntario;
        this.emailVoluntario = emailVoluntario;
        this.telefoneVoluntario = telefoneVoluntario;
        this.enderecoDTO = enderecoDTO;
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
            return enderecoDTO;
        }

    public void setEndereco(Endereco enderecoDTO) {
         this.enderecoDTO = enderecoDTO;
        }


    public Voluntario toModel(VoluntarioDTO dto) {
        Voluntario voluntario = new Voluntario(
                dto.getNomeVoluntario(),
                dto.getSobreNomeVoluntario(),
                dto.getCpfVoluntario(),
                dto.getEmailVoluntario(),
                dto.getTelefoneVoluntario(),
                dto.getEndereco()
        );

        return voluntario;
    }
    
}
