package service;

import dao.TarifsDAO;

public class TarifService {

    private final TarifsDAO tarifsDAO;

    public TarifService(TarifsDAO tarifsDAO) {
        this.tarifsDAO = tarifsDAO;
    }
}
