package org.gonchar.chucknorrisjokes.controller;

import org.gonchar.chucknorrisjokes.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    String getJoke(Model model) {
        String joke = jokesService.getJoke();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
