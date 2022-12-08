/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class Market {
    private CommodityMarket commodityMarket;
    private EquityMarket equityMarket;
    public Market(){
        
    }

    public CommodityMarket getCommodityMarket() {
        return commodityMarket;
    }

    public void setCommodityMarket(CommodityMarket commodityMarket) {
        this.commodityMarket = commodityMarket;
    }

    public EquityMarket getEquityMarket() {
        return equityMarket;
    }

    public void setEquityMarket(EquityMarket equityMarket) {
        this.equityMarket = equityMarket;
    }
    
}
