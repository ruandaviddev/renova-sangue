package com.web.ufc.renova_sangue.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.web.ufc.renova_sangue.entity.Hemocentro;
import com.web.ufc.renova_sangue.service.HemocentroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaHemocentroController {
    private final HemocentroService hemocentroService;
    public  TelaHemocentroController(HemocentroService hemocentroService) {
        this.hemocentroService = hemocentroService;
    }

    @GetMapping("/telahemocentros")
    public String exibirHemocentros(Model model) {
        List<Hemocentro> hemocentros = hemocentroService.listarTodos();
        model.addAttribute("hemocentros", hemocentros);
        return "TelaHemocentros";
    }
}