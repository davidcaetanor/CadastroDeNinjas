package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Informando que é uma aplication Controller
@RequestMapping // Organizar as rotas

public class Controller {

    @GetMapping("/boasvindas") // Pega informaçao do metodo
    public String boasVindas(){
        return "Primeira Mensagem nessa rota";
    }
}
