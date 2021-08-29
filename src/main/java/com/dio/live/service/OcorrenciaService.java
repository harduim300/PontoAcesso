package com.dio.live.service;

import com.dio.live.model.Ocorrencia;
import com.dio.live.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(long idOcorrencia) {
        return ocorrenciaRepository.findById(idOcorrencia);
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void deleteOcorrencia(long idOcorrencia) {
        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}
