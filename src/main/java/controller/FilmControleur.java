package controller;
import service.FilmService;

public class FilmControleur {
    private final FilmService filmService;

    public FilmControleur(FilmService filmService){
        this.filmService = filmService;
    }
}
