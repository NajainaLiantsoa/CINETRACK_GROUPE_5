package controller;

import service.TarifService;

public class TarifsController {

    private final TarifService tarifService;

    public TarifsController(TarifService tarifService) {
        this.tarifService = tarifService;
    }
}
