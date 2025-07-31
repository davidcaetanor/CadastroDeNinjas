package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.*;

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
