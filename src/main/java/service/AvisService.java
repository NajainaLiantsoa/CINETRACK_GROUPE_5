package service;

import dao.AvisDAO;

public class AvisService {

    private final AvisDAO avisDAO;

    public AvisService(AvisDAO avisDAO) {
        this.avisDAO = avisDAO;
    }
}
