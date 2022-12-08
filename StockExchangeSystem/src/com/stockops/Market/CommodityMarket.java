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
public class CommodityMarket {
   private ArrayList<Commodity> commodityList;
   private CommodityMarketModerator commodityMarketModerator;
   public CommodityMarket(){
       commodityList = new ArrayList<>();
   }

    public CommodityMarketModerator getCommodityMarketModerator() {
        return commodityMarketModerator;
    }

    public void setCommodityMarketModerator(CommodityMarketModerator commodityMarketModerator) {
        this.commodityMarketModerator = commodityMarketModerator;
    }

    public ArrayList<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(ArrayList<Commodity> commodityList) {
        this.commodityList = commodityList;
    }
    
    public Commodity getCommodityByName(String name){
        for(Commodity commodity:this.commodityList){
            if(commodity.getName().equals(name)){
                return commodity;
            }
        }
        return null;
    }
   
   
}
