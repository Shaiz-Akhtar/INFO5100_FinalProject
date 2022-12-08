/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Investor;

import com.stockops.Establishments.Company;
import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class Investor {
    private ArrayList<RetailInvestor> retailInvestorDirectory;
    private ArrayList<DayTrader> dayTraderDirectory;
    private ArrayList<Company> organizationalInvestorDirectory;

    public Investor() {
        this.retailInvestorDirectory= new ArrayList<>();
        this.dayTraderDirectory = new ArrayList<>();
        this.organizationalInvestorDirectory = new ArrayList<>();
    }

    public ArrayList<RetailInvestor> getRetailInvestorDirectory() {
        return retailInvestorDirectory;
    }

    public void setRetailInvestorDirectory(ArrayList<RetailInvestor> retailInvestorDirectory) {
        this.retailInvestorDirectory = retailInvestorDirectory;
    }

    public ArrayList<DayTrader> getDayTraderDirectory() {
        return dayTraderDirectory;
    }

    public void setDayTraderDirectory(ArrayList<DayTrader> dayTraderDirectory) {
        this.dayTraderDirectory = dayTraderDirectory;
    }

    public ArrayList<Company> getOrganizationalInvestorDirectory() {
        return organizationalInvestorDirectory;
    }

    public void setOrganizationalInvestorDirectory(ArrayList<Company> organizationalInvestorDirectory) {
        this.organizationalInvestorDirectory = organizationalInvestorDirectory;
    }
    
    
}
