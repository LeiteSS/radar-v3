package com.fateczl.radarapi.model.entities;

import javax.persistence.*;

@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFoto;

    @Column(nullable = false)
    private String altText;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String type;

    @Column(nullable = false)
    private String imageBytes;

    /*@Lob
    @Column(columnDefinition = "BLOB")
    private byte[] imageBytes;*/

    public Foto() {
    }

    public Foto(Long idFoto, String altText, String name, String type, String imageBytes) {
        this.idFoto = idFoto;
        this.altText = altText;
        this.name = name;
        this.type = type;
        this.imageBytes = imageBytes;
    }

    public Foto(FotoBuilder fotoBuilder) {
        this.idFoto = fotoBuilder.idFoto;
        this.altText = fotoBuilder.altText;
        this.name = fotoBuilder.name;
        this.type = fotoBuilder.type;
        this.imageBytes = fotoBuilder.imageBytes;
    }

    public Long getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(String imageBytes) {
        this.imageBytes = imageBytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Builder Designer Pattern
    public static class FotoBuilder {
        private Long idFoto;
        private String altText;
        private String name;
        private String type;
        private String imageBytes;

        public FotoBuilder(String altText, String name, String type, String imageBytes) {
            this.altText = altText;
            this.name = name;
            this.type = type;
            this.imageBytes = imageBytes;
        }

        public void setAltText(String altText) {
            this.altText = altText;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }


        public void setImageBytes(String imageBytes) {
            this.imageBytes = imageBytes;
        }

        public void setIdFoto(Long idFoto) {
            this.idFoto = idFoto;
        }

        public Foto build() {
            return new Foto(this);
        }
    }
}
