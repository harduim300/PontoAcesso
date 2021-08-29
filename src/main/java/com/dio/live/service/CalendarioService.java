package com.dio.live.service;

import com.dio.live.model.Calendario;
import com.dio.live.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    @Autowired
    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository bancoHorasRepository) {
        this.calendarioRepository = bancoHorasRepository;
    }

    public Calendario saveCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(long idCalendario) {
        return calendarioRepository.findById(idCalendario);
    }

    public Calendario updateCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public void deleteCalendario(long idCalendario) {
        calendarioRepository.deleteById(idCalendario);
    }
}
