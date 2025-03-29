package esercizio.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import esercizio.best_of_the_year.models.Movie;
import esercizio.best_of_the_year.models.Song;

@Controller
@RequestMapping("/")
public class BoTyController {


    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Heretic"));
        movies.add(new Movie(2, "Follemente"));
        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "ReawakeR - Lisa"));
        songs.add(new Song(2, "Shadowborn - Sawano Hiroyuki"));
        return songs;   
    }


@GetMapping("/")//nome url//
public String bestOfTheYear(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("name", name);
    return "bestOfTheYear";//pagina html di ritorno//
}

@GetMapping("/movies")
public String moviesList(Model model) {

    List<Movie> bestMovies = getBestMovies();
    
    /*con stringa 
    String movieTitles = bestMovies.stream().map(Movie::getTitolo).collect(Collectors.joining(", "));
    model.addAttribute("movieTitles", movieTitles);
    */

    model.addAttribute("bestMovies", bestMovies);
    return "movies";
}

@GetMapping("/songs")
public String songsList(Model model) {

    List<Song> bestSongs = getBestSongs();

    /*con stringa 
    String songTitles = bestSongs.stream().map(Song::getTitolo).collect(Collectors.joining(", "));
    model.addAttribute("bestSong", songTitles);
    */


    model.addAttribute("bestSong", bestSongs);
    return "songs";
}


@GetMapping("/songs/{id}")
public String songId(@PathVariable int id, Model model) {

    List<Song> bestSongs = getBestSongs();
    
    // Cerca la canzone per ID
    Song selectSong = bestSongs.stream()
                                 .filter(song -> song.getId() == id)//filtra le canzoni per id//
                                 .findFirst()//restituisce il primo elemento//
                                 .orElse(null);//se la canzone non viene trovata//

    model.addAttribute("id", id);
    model.addAttribute("song", selectSong);

    return "song-select"; 
}

@GetMapping("/movies/{id}")
public String movieId(@PathVariable int id, Model model) {

    List<Movie> bestMovies = getBestMovies();

    Movie selectMovie = bestMovies.stream().filter(movie -> movie.getId() == id).findFirst().orElse(null);

    model.addAttribute("id", id);
    model.addAttribute("movie", selectMovie);


    return "movie-select";
}




}