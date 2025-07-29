package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController // Informando que é uma aplication Controller
@RequestMapping // Organizar as rotas

public class NinjaController {

    // Pega informaçao do metodo
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Primeira Mensagem nessa rota";
    }

    // Aba para criar o ninja
    @PostMapping("/add")
    public String createNinja(){
        return "Criando Ninja";
    }

    // Exibindo todos os ninjas
    @GetMapping("/allninjas")
    public String allNinjas(){
        return "Mostrando todos os ninjas";
    }

    // exibindo ninjas por ID
    @GetMapping("/ninjasbyID")
    public String ninjasByID(){
        return "Mostrando ninjas por ID";
    }

    // Atualizando ninja ja cadastrado
    @PutMapping("/ninjasupdateID")
    public String ninjasUpdate(){
        return "Atualizando o ninja";
    }

//  Deletando ninja por ID
    @DeleteMapping("/deleteID")
    public String deleteID(){
        return "Deletando ninja por id";
    }

}
