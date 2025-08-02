package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> allNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel ninjasByID(Long id){
        Optional<NinjaModel> optionalNinja = ninjaRepository.findById(id);
        return optionalNinja.orElse(null);
    }

    public NinjaDTO addNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninjaSave;
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaSave = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaSave);
    }

    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    public NinjaModel updateNinja(Long id, NinjaModel ninja){
        if (ninjaRepository.existsById(id)){
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        }
        return null;
    }

}
