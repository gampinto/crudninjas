package com.projeto.naruto.crud_ninjas.controllers;

import com.projeto.naruto.crud_ninjas.entities.Ninja;
import com.projeto.naruto.crud_ninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    // Listar todos os ninjas
    @GetMapping
    public String list(Model model) {
        List<Ninja> ninjas = ninjaService.findAll();
        model.addAttribute("ninjas", ninjas);
        return "ninja/list";
    }

    // Formulário para adicionar um ninja
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("ninja", new Ninja());
        return "ninja/add";
    }

    // Salvar um novo ninja
    @PostMapping("/save")
    public String save(@ModelAttribute Ninja ninja) {
        ninjaService.save(ninja);
        return "redirect:/ninjas";
    }

    // Detalhes de um ninja
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Optional<Ninja> ninja = ninjaService.findById(id);
        ninja.ifPresent(value -> model.addAttribute("ninja", value));
        return "ninja/detail";
    }

    // Remover um ninja
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        ninjaService.deleteById(id);
        return "redirect:/ninjas";
    }
}
