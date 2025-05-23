package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Perifericos;
import br.fatecrl.mvcdemo.repository.PerifericosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PerifericosController {

    @Autowired
    private PerifericosRepository perifericosRepository;

    @GetMapping("/perifericos")
    public String listarPerifericos(@RequestParam(required = false) String nome, Model model) {
        Iterable<Perifericos> perifericos;
        if (nome != null && !nome.isEmpty()) {
            perifericos = perifericosRepository.findAll()
                .stream()
                .filter(p -> p.getNome().toLowerCase().contains(nome.toLowerCase()))
                .toList();
        } else {
            perifericos = perifericosRepository.findAll();
        }
        model.addAttribute("perifericos", perifericos);
        return "perifericos";
    }

}
