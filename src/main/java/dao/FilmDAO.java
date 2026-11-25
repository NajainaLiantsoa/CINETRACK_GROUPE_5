package dao;

import java.util.List;

import model.Film;

public interface FilmDAO {

    void insererFilm(Film film);

    void modifierFilm(Film film);

    void supprimerFilm(int idFilm);

    Film rechercherFilm(int idFilm);

    List<Film> getAllFilms();
}
