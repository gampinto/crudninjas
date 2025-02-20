package com.projeto.naruto.crud_ninjas.services;

import com.projeto.naruto.crud_ninjas.entities.Ninja;
import com.projeto.naruto.crud_ninjas.repositories.NinjaRepository;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> getAllNinjas() {
        return ninjaRepository.findAll();
    }

    public Ninja getNinjaById(Long id) {
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public Ninja updateNinja(Long id, Ninja ninja) {
     ninja.setId(id);
        return ninjaRepository.save(ninja);
    }

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }
}
