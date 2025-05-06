package it.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Movimento;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String renderPage(Model model){
        Movimento movimento = new Movimento();
        model.addAttribute("movimento", movimento);
        return "index";
    }
}
