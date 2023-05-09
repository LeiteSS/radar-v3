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
    private String sobrenomeDesaparecido;

    @Column(nullable = false)
    private String dataDesaparecimento;

    @Column(nullable = false)
    private String horaDesaparecimento;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String descricaoDesaparecido;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private String recompensa;

    @OneToOne
    private Endereco endereco;

    /*@OneToMany
    private List<Foto> fotos;*/

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "desaparecidos_fotos", joinColumns = @JoinColumn(name = "id_desaparecido"))
    @Column(name = "fotos_id")
    private List<String> fotos;


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

    @Column(nullable = false)
    private String sexoDesaparecido;

    public Desaparecido() {
    }

    public Desaparecido(Long idDesaparecido, String nomeDesaparecido, String sobrenomeDesaparecido, String dataDesaparecimento, String horaDesaparecimento, String descricaoDesaparecido, String dataNascimento, String recompensa, Endereco endereco, List<String> fotos, String possuiDoenca, String corDePeleDesaparecido, String tatuagemDesaparecido, String cicatriz, Double tamanhoDesaparecido, String sexoDesaparecido) {
        this.idDesaparecido = idDesaparecido;
        this.nomeDesaparecido = nomeDesaparecido;
        this.sobrenomeDesaparecido = sobrenomeDesaparecido;
        this.dataDesaparecimento = dataDesaparecimento;
        this.horaDesaparecimento = horaDesaparecimento;
        this.descricaoDesaparecido = descricaoDesaparecido;
        this.dataNascimento = dataNascimento;
        this.recompensa = recompensa;
        this.endereco = endereco;
        this.fotos = fotos;
        this.possuiDoenca = possuiDoenca;
        this.corDePeleDesaparecido = corDePeleDesaparecido;
        this.tatuagemDesaparecido = tatuagemDesaparecido;
        this.cicatriz = cicatriz;
        this.tamanhoDesaparecido = tamanhoDesaparecido;
        this.sexoDesaparecido = sexoDesaparecido;
    }

    public Desaparecido(String nomeDesaparecido, String sobrenomeDesaparecido, String dataDesaparecimento, String horaDesaparecimento, String descricaoDesaparecido, String dataNascimento, String recompensa, Endereco endereco, List<String> fotos, String possuiDoenca, String corDePeleDesaparecido, String tatuagemDesaparecido, String cicatriz, Double tamanhoDesaparecido, String sexoDesaparecido) {
        this.nomeDesaparecido = nomeDesaparecido;
        this.sobrenomeDesaparecido = sobrenomeDesaparecido;
        this.dataDesaparecimento = dataDesaparecimento;
        this.horaDesaparecimento = horaDesaparecimento;
        this.descricaoDesaparecido = descricaoDesaparecido;
        this.dataNascimento = dataNascimento;
        this.recompensa = recompensa;
        this.endereco = endereco;
        this.fotos = fotos;
        this.possuiDoenca = possuiDoenca;
        this.corDePeleDesaparecido = corDePeleDesaparecido;
        this.tatuagemDesaparecido = tatuagemDesaparecido;
        this.cicatriz = cicatriz;
        this.tamanhoDesaparecido = tamanhoDesaparecido;
        this.sexoDesaparecido = sexoDesaparecido;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco enderecoDTO) {
        this.endereco = enderecoDTO;
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

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }

    public String getSobrenomeDesaparecido() {
        return sobrenomeDesaparecido;
    }

    public void setSobrenomeDesaparecido(String sobrenomeDesaparecido) {
        this.sobrenomeDesaparecido = sobrenomeDesaparecido;
    }

    public String getHoraDesaparecimento() {
        return horaDesaparecimento;
    }

    public void setHoraDesaparecimento(String horaDesaparecimento) {
        this.horaDesaparecimento = horaDesaparecimento;
    }

    public String getSexoDesaparecido() {
        return sexoDesaparecido;
    }

    public void setSexoDesaparecido(String sexoDesaparecido) {
        this.sexoDesaparecido = sexoDesaparecido;
    }
}
