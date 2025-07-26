package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Informando que é uma aplication Controller
@RequestMapping // Organizar as rotas

public class NinjaController {

    @GetMapping("/boasvindas") // Pega informaçao do metodo
    public String boasVindas() {
        return "Primeira Mensagem nessa rota";
    }
}
