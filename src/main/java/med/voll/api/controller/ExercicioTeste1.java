package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testehello")
public class ExercicioTeste1 {
    @GetMapping
    public String exerTeste() {
        return "Resultado do Exercício";
    }
}
