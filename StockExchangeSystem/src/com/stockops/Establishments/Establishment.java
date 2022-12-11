/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

import java.util.ArrayList;

/**
 *
 * @author Shaiz
 */
public class Establishment {
    private ArrayList<Company> companyDirectory;
    private EstablishmentsModerator establishmentsModerator;
    public Establishment(){
        companyDirectory = new ArrayList<>();
    }

    public ArrayList<Company> getCompanyDirectory() {
        return companyDirectory;
    }

    public void setCompanyDirectory(ArrayList<Company> companyDirectory) {
        this.companyDirectory = companyDirectory;
    }

    public EstablishmentsModerator getEstablishmentsModerator() {
        return establishmentsModerator;
    }

    public void setEstablishmentsModerator(EstablishmentsModerator establishmentsModerator) {
        this.establishmentsModerator = establishmentsModerator;
    }
    
    
}
