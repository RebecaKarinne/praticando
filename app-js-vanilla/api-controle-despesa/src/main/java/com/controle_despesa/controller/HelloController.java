package com.controle_despesa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa classe vai ser um controller
@RequestMapping("/hello") // path ou endereço do recurso
public class HelloController {

    @GetMapping // o tipo do método. No caso, método GET
    public String getHello() {
        return "Hello Spring";
    }

    // um dentro do outro
    @GetMapping("/nome_completo")
    public String nomeCompleto() {
        return "Rebeca Karinne Cavalcanti Lira";
    }

}



