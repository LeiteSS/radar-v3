package com.fateczl.radarapi.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Desaparecido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDesaparecido;

    @Column(nullable = false)
    private String nomeDesaparecido;

    @Column(nullable = false)
    private String dataDesaparecimento;

    @Column(nullable = false)
    private String descricaoDesaparecido;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private String recompensa;

    @OneToOne
    private EnderecoDTO enderecoDTO;

    @OneToMany
    private List<Foto> fotoList;

    @Column(nullable = false)
    private String possuiDoenca;

    @Column(nullable = false)
    private String corDePeleDesaparecido;

    @Column(nullable = false)
    private String tatuagemDesaparecido;

    @Column(nullable = false)
    private String cicatriz;

    @Column(nullable = false)
    private Double tamanhoDesaparecido;

    public Desaparecido() {
    }

    public Desaparecido(Long idDesaparecido, String nomeDesaparecido, String dataDesaparecimento, String descricaoDesaparecido, String dataNascimento, String recompensa, EnderecoDTO enderecoDTO, List<Foto> fotoList, String possuiDoenca, String corDePeleDesaparecido, String tatuagemDesaparecido, String cicatriz, Double tamanhoDesaparecido) {
        this.idDesaparecido = idDesaparecido;
        this.nomeDesaparecido = nomeDesaparecido;
        this.dataDesaparecimento = dataDesaparecimento;
        this.descricaoDesaparecido = descricaoDesaparecido;
        this.dataNascimento = dataNascimento;
        this.recompensa = recompensa;
        this.enderecoDTO = enderecoDTO;
        this.fotoList = fotoList;
        this.possuiDoenca = possuiDoenca;
        this.corDePeleDesaparecido = corDePeleDesaparecido;
        this.tatuagemDesaparecido = tatuagemDesaparecido;
        this.cicatriz = cicatriz;
        this.tamanhoDesaparecido = tamanhoDesaparecido;
    }
    public Desaparecido(String nomeDesaparecido, String dataDesaparecimento, String descricaoDesaparecido, String dataNascimento, String recompensa, EnderecoDTO enderecoDTO, List<Foto> fotoList, String possuiDoenca, String corDePeleDesaparecido, String tatuagemDesaparecido, String cicatriz, Double tamanhoDesaparecido) {
        this.nomeDesaparecido = nomeDesaparecido;
        this.dataDesaparecimento = dataDesaparecimento;
        this.descricaoDesaparecido = descricaoDesaparecido;
        this.dataNascimento = dataNascimento;
        this.recompensa = recompensa;
        this.enderecoDTO = enderecoDTO;
        this.fotoList = fotoList;
        this.possuiDoenca = possuiDoenca;
        this.corDePeleDesaparecido = corDePeleDesaparecido;
        this.tatuagemDesaparecido = tatuagemDesaparecido;
        this.cicatriz = cicatriz;
        this.tamanhoDesaparecido = tamanhoDesaparecido;
    }

    public Long getIdDesaparecido() {
        return idDesaparecido;
    }

    public void setIdDesaparecido(Long idDesaparecido) {
        this.idDesaparecido = idDesaparecido;
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

    public EnderecoDTO getEndereco() {
        return enderecoDTO;
    }

    public void setEndereco(EnderecoDTO enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public List<Foto> getFotoList() {
        return fotoList;
    }

    public void setFotoList(List<Foto> fotoList) {
        this.fotoList = fotoList;
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
}
