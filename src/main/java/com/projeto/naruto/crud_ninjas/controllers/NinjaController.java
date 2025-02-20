package com.projeto.naruto.crud_ninjas.controllers;

import com.projeto.naruto.crud_ninjas.entities.Ninja;
import com.projeto.naruto.crud_ninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public List<Ninja> getAllNinjas() {
        return ninjaService.getAllNinjas();
    }

    @GetMapping("/{id}")
    public Ninja getNinjaById(@PathVariable Long id) {
        return ninjaService.getNinjaById(id);
    }

    @PostMapping
    public Ninja createNinja(@RequestBody Ninja ninja) {
        return ninjaService.createNinja(ninja);
    }

    @PutMapping("/{id}")
    public Ninja updateNinja(@PathVariable Long id, @RequestBody Ninja ninja) {
        return ninjaService.updateNinja(id, ninja);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaService.deleteNinja(id);
    }
}
