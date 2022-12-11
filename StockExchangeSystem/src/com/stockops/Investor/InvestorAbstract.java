/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Investor;

import com.stockops.Brokerage.CommodityBuyRequest;
import com.stockops.Brokerage.CommoditySellRequest;
import com.stockops.Brokerage.EquityBuyRequest;
import com.stockops.Brokerage.EquitySellRequest;
import com.stockops.Market.Equity;
import com.stockops.Users.AppUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shaiz
 */
public class InvestorAbstract extends AppUser{
    private double balance;
    private ArrayList<EquityBuyRequest> equityBuyRequests;
    private ArrayList<CommodityBuyRequest> commodityBuyRequests;
    private ArrayList<EquitySellRequest> equitySellRequests;
    private ArrayList<CommoditySellRequest> commoditySellRequests;
    private Map<Equity,Integer> holdings;
    private ArrayList<CommodityHoldings> commodityHoldings;
    private ArrayList<EquityHoldings> equityHoldings;
    public InvestorAbstract(){
        equityBuyRequests=new ArrayList<>();
        commodityBuyRequests=new ArrayList<>();
        commoditySellRequests=new ArrayList<>();
        equitySellRequests=new ArrayList<>();
        holdings= new HashMap<>();
        commodityHoldings=new ArrayList<>();
        balance=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public ArrayList<EquityBuyRequest> getEquityBuyRequests() {
        return equityBuyRequests;
    }

    public void setEquityBuyRequests(ArrayList<EquityBuyRequest> equityBuyRequests) {
        this.equityBuyRequests = equityBuyRequests;
    }

    public ArrayList<CommodityBuyRequest> getCommodityBuyRequests() {
        return commodityBuyRequests;
    }

    public void setCommodityBuyRequests(ArrayList<CommodityBuyRequest> commodityBuyRequests) {
        this.commodityBuyRequests = commodityBuyRequests;
    }

    public ArrayList<EquitySellRequest> getEquitySellRequests() {
        return equitySellRequests;
    }

    public void setEquitySellRequests(ArrayList<EquitySellRequest> equitySellRequests) {
        this.equitySellRequests = equitySellRequests;
    }

    public ArrayList<CommoditySellRequest> getCommoditySellRequests() {
        return commoditySellRequests;
    }

    public void setCommoditySellRequests(ArrayList<CommoditySellRequest> commoditySellRequests) {
        this.commoditySellRequests = commoditySellRequests;
    }

    public Map<Equity, Integer> getHoldings() {
        return holdings;
    }

    public void setHoldings(Map<Equity, Integer> holdings) {
        this.holdings = holdings;
    }

    public ArrayList<CommodityHoldings> getCommodityHoldings() {
        if(commodityHoldings==null){
            setCommodityHoldings(new ArrayList<>());
        }
        return commodityHoldings;
    }

    public void setCommodityHoldings(ArrayList<CommodityHoldings> commodityHoldings) {
        this.commodityHoldings = commodityHoldings;
    }

    public ArrayList<EquityHoldings> getEquityHoldings() {
        if(equityHoldings==null){
            setEquityHoldings(new ArrayList<>());
        }
        return equityHoldings;
    }

    public void setEquityHoldings(ArrayList<EquityHoldings> equityHoldings) {
        this.equityHoldings = equityHoldings;
    }
    
    
}
