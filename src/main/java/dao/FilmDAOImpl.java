package dao;

import java.util.ArrayList;
import java.util.List;

import model.Film;

public class FilmDAOImpl implements FilmDAO {

    @Override
    public void insererFilm(Film film) {
        // Code SQL INSERT
    }

    @Override
    public void modifierFilm(Film film) {
        // Code SQL UPDATE
    }

    @Override
    public void supprimerFilm(int idFilm) {
        // Code SQL DELETE
    }

    @Override
    public Film rechercherFilm(int idFilm) {
        // Code SQL SELECT WHERE
        return null;
    }

    @Override
    public List<Film> getAllFilms() {
        // Code SQL SELECT
        return new ArrayList<>();
    }
}