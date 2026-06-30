package com.web.ufc.renova_sangue.service;

import com.web.ufc.renova_sangue.entity.Relato;
import com.web.ufc.renova_sangue.repository.RelatoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
    public void salvar(String nome, String tipoSanguineo, String historia) {
        Relato relato = new Relato();
        relato.setNome_autor(nome);
        relato.setTipo_sanguineo(tipoSanguineo);
        relato.setTexto_relato(historia);
        relato.setData_criacao(LocalDateTime.now());
        repository.save(relato);
    }
}