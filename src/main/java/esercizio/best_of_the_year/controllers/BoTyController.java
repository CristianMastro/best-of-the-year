package esercizio.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class BoTyController {
@GetMapping("/bestOfTheYear")
public String greeting(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("name", name);
    return "bestOfTheYear";
}

}