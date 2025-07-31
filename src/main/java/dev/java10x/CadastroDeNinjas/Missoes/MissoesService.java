package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> allMissions(){
        return missoesRepository.findAll();
    }

    public MissoesModel missionsByID(Long id){
        Optional<MissoesModel> missionsModel = missoesRepository.findById(id);
        return missionsModel.orElse(null);
    }

    public MissoesModel addMissions(MissoesModel mission){
        return missoesRepository.save(mission);
    }

    public void deleteMission(Long id){
        missoesRepository.deleteById(id);
    }

    public MissoesModel updateMissions(Long id, MissoesModel missionsUpdate){
        if (missoesRepository.existsById(id)){
            missionsUpdate.setId(id);
            missoesRepository.save(missionsUpdate);
        }
        return null;
    }

}
