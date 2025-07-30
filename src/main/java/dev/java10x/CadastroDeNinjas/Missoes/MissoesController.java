package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missions")
public class MissoesController {

    @GetMapping("/viewall")
    public String allMissions(){
        return "Mostrando todas as missoes";
    }

    @GetMapping("/byid")
    public String missionsByID(){
        return "Mostrando todas as missoes";
    }

    @PostMapping("/add")
    public String postMission(){
        return "Criando uma missao";
    }

    @PutMapping("/updateid")
    public String putMission(){
        return "Alterando uma missao";
    }

    @DeleteMapping("/deleteid")
    public String deleteMissionID(){
        return "Deletando Missao";
    }

}
