/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Business;

import com.stockops.Brokerage.Brokerage;
import com.stockops.Establishments.Establishment;
import com.stockops.Investor.Investor;
import com.stockops.Market.Market;
import com.stockops.Users.UserAccountDirectory;

/**
 *
 * @author mridulregmi
 */
public class EcoSystem {
    private UserAccountDirectory userDirectory;
    private Market market;
    private Brokerage brokerage;
    private Establishment establishment;
    private Investor investor;
    private int userCount=0;
    
    public EcoSystem(){
        userDirectory = new UserAccountDirectory();
        market = new Market();
        brokerage=new Brokerage();
        establishment=new Establishment();
        investor = new Investor();
    }

    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Brokerage getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(Brokerage brokerage) {
        this.brokerage = brokerage;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
    
}
