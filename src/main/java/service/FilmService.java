package service;
import dao.FilmDAO;

public class FilmService {
    private final FilmDAO filmDAO;

    public FilmService(FilmDAO filmDAO){
        this.filmDAO = filmDAO;
    }
}
