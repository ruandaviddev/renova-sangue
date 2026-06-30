package com.web.ufc.renova_sangue.controller;

import com.web.ufc.renova_sangue.entity.Relato;
import com.web.ufc.renova_sangue.service.RelatoService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TelaComunidadeController {
    private final RelatoService relatoService;

    public TelaComunidadeController(RelatoService relatoService) {
        this.relatoService = relatoService;
    }

    @GetMapping("/telacomunidade")
    public String exibirComunidade(@RequestParam(value = "pagina", defaultValue = "1") int pagina, Model model) {
        Page<Relato> paginaRelatos = relatoService.listarPaginado(pagina);

        model.addAttribute("paginaAtual", pagina);
        model.addAttribute("totalPaginas", paginaRelatos.getTotalPages());
        model.addAttribute("historias", paginaRelatos.getContent());

        return "TelaComunidade";
    }

    @PostMapping("/publicar-historia")
    public String publicarHistoria(
            @RequestParam String nome,
            @RequestParam String tipoSanguineo,
            @RequestParam String historia) {

        relatoService.salvar(nome, tipoSanguineo, historia);

        return "redirect:/telacomunidade";
    }

    @GetMapping("/comunidade/nova-historia")
    public String exibirFormularioHistoria() {
        return "TelaHistoria";
    }
}