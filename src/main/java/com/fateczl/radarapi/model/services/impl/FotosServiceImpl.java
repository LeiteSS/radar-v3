package com.fateczl.radarapi.model.services.impl;

import com.fateczl.radarapi.model.entities.Desaparecido;
import com.fateczl.radarapi.model.entities.Foto;
import com.fateczl.radarapi.model.repository.FotosRepository;
import com.fateczl.radarapi.model.services.FotosService;
import com.fateczl.radarapi.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class FotosServiceImpl implements FotosService {
    @Autowired
    private FotosRepository fotosRepository;


    @Override
    public Foto upload(MultipartFile file) throws IOException {
        return fotosRepository.save(new Foto.FotoBuilder(file.getOriginalFilename(), file.getName(), file.getContentType(), file.getBytes()).build());
    }

    @Override
    public Foto getByName(String name) {
        return null;
    }

    @Override
    public byte[] getImage(Desaparecido desaparecido) {
        Optional<Foto> images = fotosRepository.findByDesaparecido(desaparecido);
        byte[] image = ImageUtil.decompressImage(images.get().getImageBytes());

        return image;
    }
}
