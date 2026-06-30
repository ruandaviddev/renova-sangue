package com.web.ufc.renova_sangue.service;

import com.web.ufc.renova_sangue.entity.Relato;
import com.web.ufc.renova_sangue.repository.RelatoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RelatoService {
    private final RelatoRepository repository;

    public RelatoService(RelatoRepository repository) {
        this.repository = repository;
    }

    public Page<Relato> listarPaginado(int pagina) {
        Pageable pageable = PageRequest.of(pagina - 1, 6); // 6 relatos por página, por exemplo
        return repository.findAll(pageable);
    }
}