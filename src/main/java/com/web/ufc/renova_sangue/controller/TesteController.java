package com.web.ufc.renova_sangue.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {

    @GetMapping("/teste")
    public String teste(Model model) {
        
        // 1. Enviando os dados do Evento
        Map<String, String> evento = new HashMap<>();
        evento.put("data", "30–31 Mai");
        evento.put("horario", "08h – 13h");
        model.addAttribute("evento", evento);

        // 2. Enviando os dados do Estoque Crítico
        Map<String, String> estoques = new HashMap<>();
        estoques.put("tipos", "Tipos O− e B−");
        model.addAttribute("estoques", estoques);

        return "index";
    }
}