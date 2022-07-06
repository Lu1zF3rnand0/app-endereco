package br.edu.infnet.appendereco.controller;

import br.edu.infnet.appendereco.model.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MunicipioController {

    @Autowired
    private MunicipioService municipioService;

    @GetMapping(value = "/municipios/{id}")
    public String telaLista(Model model, @PathVariable Integer id) {
        model.addAttribute("lista", municipioService.obterLista(id));
        return "municipio/lista";
    }
}