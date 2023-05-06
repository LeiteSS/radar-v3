package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Endereco;
import com.fateczl.radarapi.model.entities.Foto;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class DesaparecidoDTO {
    private String nomeDesaparecido;
    private String dataDesaparecimento;
    private String descricaoDesaparecido;
    private String dataNascimento;
    private String recompensa;
    private Endereco endereco;
    private List<Foto> fotoList;
    private String possuiDoenca;
    private String corDePeleDesaparecido;
    private String tatuagemDesaparecido;
    private String cicatriz;
    private Double tamanhoDesaparecido;
}
