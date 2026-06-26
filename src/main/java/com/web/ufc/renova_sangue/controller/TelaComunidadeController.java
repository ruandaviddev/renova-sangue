package com.web.ufc.renova_sangue.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TelaComunidadeController {

    @GetMapping("/telacomunidade")
    public String teste(@RequestParam(value = "pagina", defaultValue = "1") int pagina, Model model) {

        // 1. Lógica do Back: O time vai buscar do banco usando paginação (Pageable do Spring Data)
        // Exemplo de valores mockados que o back-end vai calcular dinamicamente:
        int paginaAtual = pagina; 
        int totalPaginas = 4; // viria de algo como resultadoDoBanco.getTotalPages()

        // 2. Injeta os dados de controle na View
        model.addAttribute("paginaAtual", paginaAtual);
        model.addAttribute("totalPaginas", totalPaginas);

        // 3. Criamos a lista para armazenar as histórias dos doadores
        List<Map<String, String>> listaHistorias = new ArrayList<>();

        // 4. Criamos a história da Maria Júlia
        Map<String, String> historia1 = new HashMap<>();
        historia1.put("nome", "Maria Júlia de Castro");
        historia1.put("tipo", "O+");
        historia1.put("depoimento", "Ver a bolsa sendo preenchida me enche de gratidão...");

        // Adicionamos a história na lista
        listaHistorias.add(historia1);

        // 5. Enviamos a lista para a View
        model.addAttribute("historias", listaHistorias);

        return "TelaComunidade";
    }
}