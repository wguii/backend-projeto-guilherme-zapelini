package com.projeto.countryguesser.controller;

import com.projeto.countryguesser.service.PaisService;
import com.projeto.countryguesser.entities.PaisDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jogo")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/gerar")
    public PaisDTO gerarPais() {
        return paisService.gerarPaisAleatorio();
    }

    @PostMapping("/verificar")
    public String verificarResposta(@RequestParam String resposta) {
        if (paisService.verificarResposta(resposta)) {
            return "Parabéns! Você acertou!";
        }
        return paisService.obterDica();
    }

    @GetMapping("/sobre")
    public Map<String, Object> dadosProjeto() {
        return Map.of(
                "integrante", List.of("Guilherme Zapelini"),
                "nome_projeto", "Country Guesser"
        );
    }




}
