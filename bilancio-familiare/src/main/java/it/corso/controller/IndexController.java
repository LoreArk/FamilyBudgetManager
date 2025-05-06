package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Movimento;
import it.corso.service.MovimentoService;

@Controller
@RequestMapping("/")
public class IndexController {
    
    @GetMapping
    public String renderPage(Model model){
        
        @Autowired
        private MovimentoService movimentoService;
        
        List<Movimento> movimenti = movimentoService.getAllMovimenti();
        model.addAttribute("movimenti", movimenti);
        return "index";
    }
}
