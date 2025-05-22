package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Perifericos;
import br.fatecrl.mvcdemo.repository.PerifericosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PerifericosController {

    @Autowired
    private PerifericosRepository perifericosRepository;

    @GetMapping("/perifericos")
    public String listarPerifericos(Model model) {
        model.addAttribute("perifericos", perifericosRepository.findAll());
        return "perifericos";
    }

}
