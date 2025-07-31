package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> allNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel ninjasByID(Long id){
        Optional<NinjaModel> optionalNinja = ninjaRepository.findById(id);
        return optionalNinja.orElse(null);
    }

    public NinjaModel addNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

}
