package service;
import java.util.List;

import dao.FilmDAO;
import model.Film;

public class FilmService {
    private final FilmDAO filmDAO;

    public FilmService(FilmDAO filmDAO){
        this.filmDAO = filmDAO;
    }

    public void ajouterFilm(Film film){
        filmDAO.insererFilm(film);
    }

    public List<Film> getAllFilms(){
        return filmDAO.getAllFilms();
    }

}
