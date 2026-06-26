package com.web.ufc.renova_sangue.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaHemocentroController {

    @GetMapping("/telahemocentros")
    public String exibirHemocentros(Model model) {
        List<Map<String, Object>> listaHemocentros = new ArrayList<>();

        // 1. HEMOPI
        Map<String, Object> hemocopi = new HashMap<>();
        hemocopi.put("nome", "HEMOPI (Centro de Hematologia e Hemoterapia do Piauí)");
        hemocopi.put("estado", "Piauí");
        hemocopi.put("endereco", "Rua 1° de Maio, 235, Centro (Sul) CEP: 64001-430 Teresina – PI");
        hemocopi.put("horarios", Arrays.asList("De segunda a sexta, das 8h às 18h", "Sábado, das 7h15min às 17h"));
        hemocopi.put("contatos", Arrays.asList("(86) 2221-0019"));
        listaHemocentros.add(hemocopi);

        // 2. Regional de Parnaíba
        Map<String, Object> parnaiba = new HashMap<>();
        parnaiba.put("nome", "Hemocentro Regional de Parnaíba");
        parnaiba.put("estado", "Piauí");
        parnaiba.put("endereco", "Praça Antônio Monte, Centro CEP: 64.218-340 Parnaíba–PI");
        parnaiba.put("horarios", Arrays.asList("De segunda a sexta, das 8h às 18h", "Sábado, das 7h15min às 17h"));
        parnaiba.put("contatos", Arrays.asList("(86) 2221-0019"));
        listaHemocentros.add(parnaiba);

        // 3. Regional de Picos
        Map<String, Object> picos = new HashMap<>();
        picos.put("nome", "Hemocentro Regional de Picos");
        picos.put("estado", "Piauí");
        picos.put("endereco", "Praça Antenor Néiva, Bairro Bomba CEP: 64.600-000 Picos – PI");
        picos.put("horarios", Arrays.asList("De segunda a sexta, das 8h às 18h", "Sábado, das 7h15min às 17h"));
        picos.put("contatos", Arrays.asList("(89) 2221-0019", "(89) 2221-0742"));
        listaHemocentros.add(picos);

        // 4. Regional de Floriano
        Map<String, Object> floriano = new HashMap<>();
        floriano.put("nome", "Hemocentro Regional de Floriano");
        floriano.put("estado", "Piauí");
        floriano.put("endereco", "Rua João Dantas, 1161 Bairro Manguinha CEP: 64.800-000 Floriano–PI");
        floriano.put("horarios", Arrays.asList("De segunda a sexta, das 8h às 18h", "Sábado, das 7h15min às 17h"));
        floriano.put("contatos", Arrays.asList("(89) 2221-0019", "(89) 2221-0082 (distribuição)"));
        listaHemocentros.add(floriano);

        // Enviando a estrutura para a View
        model.addAttribute("hemocentros", listaHemocentros);

        return "TelaHemocentros";
    }
}