package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missions")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping()
    public List<MissoesModel> allMissions(){
        return missoesService.allMissions();
    }

    @GetMapping("/{id}")
    public MissoesModel missionsByID(@PathVariable Long id){
        return missoesService.missionsByID(id);
    }

    @PostMapping("/add")
    public MissoesModel postMission(@RequestBody MissoesModel missoes){
        return missoesService.addMissions(missoes);
    }

    @PutMapping("/update/{id}")
    public MissoesModel putMission(@PathVariable Long id, @RequestBody MissoesModel missoesUpdate){
        return missoesService.updateMissions(id,missoesUpdate);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMissionID(@PathVariable Long id){
        missoesService.deleteMission(id);
    }

}
