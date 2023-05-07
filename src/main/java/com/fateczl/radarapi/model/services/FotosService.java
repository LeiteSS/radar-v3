package com.fateczl.radarapi.model.services;

import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Foto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

public interface FotosService {

    Foto upload(MultipartFile file) throws IOException;
    Foto getImage(Long id);
    Stream<Foto> getAll();
}
