package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Informando que é uma aplication Controller
@RequestMapping("ninjas") // Organizar as rotas

public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Aba para criar o ninja
    @PostMapping("/add")
    public NinjaModel createNinja(@RequestBody NinjaModel ninja){
        return ninjaService.addNinja(ninja);
    } // Usamos @Requestbody para o usuario encaminhar um json e encaminharmos para serializaçao dentro do banco de dados

    // Exibindo todos os ninjas
    @GetMapping
    public List<NinjaModel> allNinjas(){
        return ninjaService.allNinjas();
    }

    // exibindo ninjas por ID
    @GetMapping("/{id}")
    public NinjaModel ninjasByID(@PathVariable Long id){
        return ninjaService.ninjasByID(id);
    } //Path Variable para pegar o valor inserido pelo usuario e transformar no ID de busca

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
