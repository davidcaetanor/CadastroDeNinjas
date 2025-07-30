package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController // Informando que é uma aplication Controller
@RequestMapping("ninja") // Organizar as rotas

public class NinjaController {

    // Aba para criar o ninja
    @PostMapping("/add")
    public String createNinja(){
        return "Criando Ninja";
    }

    // Exibindo todos os ninjas
    @GetMapping("/viewall")
    public String allNinjas(){
        return "Mostrando todos os ninjas";
    }

    // exibindo ninjas por ID
    @GetMapping("/byid")
    public String ninjasByID(){
        return "Mostrando ninjas por ID";
    }

    // Atualizando ninja ja cadastrado
    @PutMapping("/updateid")
    public String ninjasUpdate(){
        return "Atualizando o ninja";
    }

//  Deletando ninja por ID
    @DeleteMapping("/deleteid")
    public String deleteID(){
        return "Deletando ninja por id";
    }

}
