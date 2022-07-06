package br.edu.infnet.appendereco.controller;

import br.edu.infnet.appendereco.model.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(value = "/estados")
    public String telaLista(Model model) {
        model.addAttribute("lista", estadoService.obterLista());
        return "estado/lista";
    }
}
