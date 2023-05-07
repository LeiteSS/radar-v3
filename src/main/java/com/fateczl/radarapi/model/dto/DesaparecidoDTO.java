package com.fateczl.radarapi.model.dto;

import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Endereco;
import com.fateczl.radarapi.model.entities.Foto;

import java.util.List;

public class DesaparecidoDTO {
    private String nomeDesaparecido;
    private String dataDesaparecimento;
    private String descricaoDesaparecido;
    private String dataNascimento;
    private String recompensa;
    private List<Endereco> enderecoDTO;

    private List<Foto> fotos;

    private String possuiDoenca;
    private String corDePeleDesaparecido;
    private String tatuagemDesaparecido;
    private String cicatriz;
    private Double tamanhoDesaparecido;

    public DesaparecidoDTO() {
    }

    public DesaparecidoDTO(String nomeDesaparecido, String dataDesaparecimento, String descricaoDesaparecido, String dataNascimento, String recompensa, List<Endereco> enderecoDTO, String possuiDoenca, String corDePeleDesaparecido, String tatuagemDesaparecido, String cicatriz, Double tamanhoDesaparecido) {
        this.nomeDesaparecido = nomeDesaparecido;
        this.dataDesaparecimento = dataDesaparecimento;
        this.descricaoDesaparecido = descricaoDesaparecido;
        this.dataNascimento = dataNascimento;
        this.recompensa = recompensa;
        this.enderecoDTO = enderecoDTO;
        this.possuiDoenca = possuiDoenca;
        this.corDePeleDesaparecido = corDePeleDesaparecido;
        this.tatuagemDesaparecido = tatuagemDesaparecido;
        this.cicatriz = cicatriz;
        this.tamanhoDesaparecido = tamanhoDesaparecido;
    }

    public String getNomeDesaparecido() {
        return nomeDesaparecido;
    }

    public void setNomeDesaparecido(String nomeDesaparecido) {
        this.nomeDesaparecido = nomeDesaparecido;
    }

    public String getDataDesaparecimento() {
        return dataDesaparecimento;
    }

    public void setDataDesaparecimento(String dataDesaparecimento) {
        this.dataDesaparecimento = dataDesaparecimento;
    }

    public String getDescricaoDesaparecido() {
        return descricaoDesaparecido;
    }

    public void setDescricaoDesaparecido(String descricaoDesaparecido) {
        this.descricaoDesaparecido = descricaoDesaparecido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public List<Endereco> getEndereco() {
        return enderecoDTO;
    }

    public void setEndereco(List<Endereco> enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public String getPossuiDoenca() {
        return possuiDoenca;
    }

    public void setPossuiDoenca(String possuiDoenca) {
        this.possuiDoenca = possuiDoenca;
    }

    public String getCorDePeleDesaparecido() {
        return corDePeleDesaparecido;
    }

    public void setCorDePeleDesaparecido(String corDePeleDesaparecido) {
        this.corDePeleDesaparecido = corDePeleDesaparecido;
    }

    public String getTatuagemDesaparecido() {
        return tatuagemDesaparecido;
    }

    public void setTatuagemDesaparecido(String tatuagemDesaparecido) {
        this.tatuagemDesaparecido = tatuagemDesaparecido;
    }

    public String getCicatriz() {
        return cicatriz;
    }

    public void setCicatriz(String cicatriz) {
        this.cicatriz = cicatriz;
    }

    public Double getTamanhoDesaparecido() {
        return tamanhoDesaparecido;
    }

    public void setTamanhoDesaparecido(Double tamanhoDesaparecido) {
        this.tamanhoDesaparecido = tamanhoDesaparecido;
    }

    public List<Endereco> getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(List<Endereco> enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public Desaparecido toModel(DesaparecidoDTO dto) {
        Desaparecido desaparecido = new Desaparecido(
                dto.getNomeDesaparecido(),
                dto.getDataDesaparecimento(),
                dto.getDescricaoDesaparecido(),
                dto.getDataNascimento(),
                dto.getRecompensa(),
                dto.getEndereco(),
                dto.getFotos(),
                dto.getPossuiDoenca(),
                dto.getCorDePeleDesaparecido(),
                dto.getTatuagemDesaparecido(),
                dto.getCicatriz(),
                dto.getTamanhoDesaparecido()
        );

        return desaparecido;
    }
}
