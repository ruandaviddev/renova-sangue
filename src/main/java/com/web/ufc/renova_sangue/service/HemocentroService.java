package com.web.ufc.renova_sangue.service;

import com.web.ufc.renova_sangue.entity.Hemocentro;
import com.web.ufc.renova_sangue.repository.HemocentroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HemocentroService {
    private final HemocentroRepository repository;

    public HemocentroService(HemocentroRepository repository) {
        this.repository = repository;
    }

    public List<Hemocentro> listarTodos() {
        return repository.findAll();
    }
}