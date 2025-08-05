package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collector;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> allNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .toList();
    }

    public NinjaDTO ninjasByID(Long id){
        Optional<NinjaModel> optionalNinja = ninjaRepository.findById(id);
        return optionalNinja.map(ninjaMapper::map).orElse(null);
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

    public NinjaDTO updateNinja(Long id, NinjaDTO ninja){
        Optional<NinjaModel> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()){
            NinjaModel ninjaUpdate = ninjaMapper.map(ninja);
            ninjaUpdate.setId(id);
            NinjaModel ninjaSave = ninjaRepository.save(ninjaUpdate);
            return ninjaMapper.map(ninjaSave);
        }
        return null;
    }

}
