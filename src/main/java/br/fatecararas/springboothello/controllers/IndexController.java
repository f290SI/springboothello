package br.fatecararas.springboothello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        System.out.println("IndexController capturou a requisição INDEX.");
        return "index";
    }

    @GetMapping("/sobre")
    public String sobre() {
        System.out.println("IndexController capturou a requisição SOBRE.");
        return "sobre";
    }

    @GetMapping("/parametro/{p}")
    public String exibeParametro(@PathVariable("p") String parametro) {
        System.out.println("Recebi o parametro: "+parametro);
        return "index";
    }
    
}
