package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missions")
public class MissoesController {

    @GetMapping("/allmissions")
    public String allMissions(){
        return "Mostrando todas as missoes";
    }

    @GetMapping("/missionsID")
    public String missionsByID(){
        return "Mostrando todas as missoes";
    }

    @PostMapping("/addmission")
    public String postMission(){
        return "Criando uma missao";
    }

    @PutMapping("/putmission")
    public String putMission(){
        return "Alterando uma missao";
    }

    @DeleteMapping("/deletemissionID")
    public String deleteMissionID(){
        return "Deletando Missao";
    }

}
