package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Foto;
//import com.fateczl.radarapi.model.repository.FotosRepository;
//import com.fateczl.radarapi.model.services.FotosService;
import com.fateczl.radarapi.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

/*@Service
public class FotosServiceImpl implements FotosService {
    @Autowired
    private FotosRepository fotosRepository;


    @Override
    public Foto upload(MultipartFile file) throws IOException {
        //return fotosRepository.save(new Foto.FotoBuilder(file.getOriginalFilename(), file.getName(), file.getContentType(), file.getBytes()).build());
        return null;
    }

    @Override
    public Foto getImage(Long id) {
        return null;
    }

    @Override
    public Stream<Foto> getAll() {
        return null;
    }
}*/
