package esercizio.best_of_the_year.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import esercizio.best_of_the_year.models.Movie;
import esercizio.best_of_the_year.models.Song;

@Controller
@RequestMapping("/")
public class BoTyController {

    private List<Movie> movies;
    private List<Song> songs;

    private List<Movie> getBestMovies() {
        return movies;
    }

    private List<Song> getBestSongs() {
        return songs;   
    }

@GetMapping("/bestOfTheYear")
public String bestOfTheYear(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("movies", getBestMovies());
    model.addAttribute("songs", getBestSongs());
    return "bestOfTheYear";
}


}