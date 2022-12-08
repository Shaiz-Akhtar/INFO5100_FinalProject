/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class Brokerage {
    private ArrayList<EquityBroker> equityBrokersDirectory;
    private ArrayList<CommodityBroker> commodityBrokersDirectory;
    private BrokerageModerator brokerageModerator;
    private int buyRequestCount;
    private int sellRequestCount;
    
    public Brokerage(){
        equityBrokersDirectory=new ArrayList<>();
        commodityBrokersDirectory=new ArrayList<>();
        buyRequestCount=0;
        sellRequestCount=0;
    }

    public BrokerageModerator getBrokerageModerator() {
        return brokerageModerator;
    }

    public void setBrokerageModerator(BrokerageModerator brokerageModerator) {
        this.brokerageModerator = brokerageModerator;
    }

    public ArrayList<EquityBroker> getEquityBrokersDirectory() {
        return equityBrokersDirectory;
    }

    public void setEquityBrokersDirectory(ArrayList<EquityBroker> equityBrokersDirectory) {
        this.equityBrokersDirectory = equityBrokersDirectory;
    }

    public ArrayList<CommodityBroker> getCommodityBrokersDirectory() {
        return commodityBrokersDirectory;
    }

    public void setCommodityBrokersDirectory(ArrayList<CommodityBroker> commodityBrokersDirectory) {
        this.commodityBrokersDirectory = commodityBrokersDirectory;
    }
    
    public EquityBroker getBrokerByName(String name){
        for(EquityBroker equityBroker: this.equityBrokersDirectory){
            if(equityBroker.getName().equals(name)){
                return equityBroker;
            }
        }
        return null;
    }

    public int getBuyRequestCount() {
        return buyRequestCount;
    }

    public void setBuyRequestCount(int buyRequestCount) {
        this.buyRequestCount = buyRequestCount;
    }

    public int getSellRequestCount() {
        return sellRequestCount;
    }

    public void setSellRequestCount(int sellRequestCount) {
        this.sellRequestCount = sellRequestCount;
    }
    
    public CommodityBroker getCommodityBrokerByName(String name){
        for(CommodityBroker commodityBroker:this.commodityBrokersDirectory){
            if(commodityBroker.getName().equals(name)){
                return commodityBroker;
            }
        }
        return null;
    }
}
