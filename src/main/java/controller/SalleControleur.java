package controller;

import service.SalleService;

public class SalleControleur {
    private final SalleService salleService;

    public SalleControleur(SalleService salleService){
        this.salleService = salleService ; 
    }
}
