package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Informando que é uma aplication Controller
@RequestMapping("ninja") // Organizar as rotas

public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Aba para criar o ninja
    @PostMapping("/add")
    public String createNinja(){
        return "Criando Ninja";
    }

    // Exibindo todos os ninjas
    @GetMapping("/viewall")
    public List<NinjaModel> allNinjas(){
        return ninjaService.allNinjas();
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
