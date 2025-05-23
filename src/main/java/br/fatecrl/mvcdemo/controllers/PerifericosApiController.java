package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Perifericos;
import br.fatecrl.mvcdemo.repository.PerifericosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/perifericos")
public class PerifericosApiController {

    @Autowired
    private PerifericosRepository perifericosRepository;

    @GetMapping
    public Iterable<Perifericos> listarPerifericos() {
        return perifericosRepository.findAll();
    }
}
