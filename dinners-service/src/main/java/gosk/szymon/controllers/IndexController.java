package gosk.szymon.controllers;

import gosk.szymon.repositories.PersonRepository;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final PersonRepository repository;

    @Contract(pure = true)
    public IndexController(PersonRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/")
    public String persons(@NotNull Model model) {
        model.addAttribute("persons", repository.findAll());
        return "index";
    }

}
