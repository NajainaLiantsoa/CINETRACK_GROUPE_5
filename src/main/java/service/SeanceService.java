package service;

import dao.SeanceDAO;

public class SeanceService {
    private final SeanceDAO seanceDAO;

    public SeanceService(SeanceDAO seanceDAO) {
        this.seanceDAO = seanceDAO;
    }
}
