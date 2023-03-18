package br.fatecararas.springboothello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/parametro/a/{a}/b/{b}")
    public String exibeParametro(@PathVariable("a") String p1, @PathVariable("b") String p2) {
        System.out.printf("Recebi os parametros a=%s e b=%s.\n: ", p1, p2);
        Integer soma = Integer.parseInt(p1) + Integer.parseInt(p2);
        System.out.printf("A soma de %s e %s é %s.\n", p1, p2, soma);
        return "index";
    }

    @GetMapping("/calculadora")
    public String exibeSoma(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        System.out.printf("Recebi os parametros a=%s e b=%s.\n: ", a, b);
        Integer soma = a + b;
        System.out.printf("A soma de %s e %s é %s.\n", a, b, soma);
        return "index";
    }
    
}
