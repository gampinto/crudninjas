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

    public List<Ninja> findAll() {
        return ninjaRepository.findAll();
    }

    public Optional<Ninja> findById(Long id) {
        return ninjaRepository.findById(id);
    }

    public Ninja save(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public void deleteById(Long id) {
        ninjaRepository.deleteById(id);
    }
}
