/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import com.stockops.Establishments.Company;
import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class Equity {
    private Company company;
    private String symbol;
    private double price;
    private int stockQuantity;
    private int availableQuantity;
    private ArrayList<Double> priceHistory;
    public Equity(){
        
    }
    public Equity(Company company, String symbol, int price){
        this.company=company;
        this.symbol=symbol;
        this.price=price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void calculateAndSetPrice() {
        setPrice(this.company.getCaptial()/this.stockQuantity);
    }

    public ArrayList<Double> getPriceHistory() {
        if(priceHistory==null){
            setPriceHistory(new ArrayList<>());
        }
        return priceHistory;
    }

    public void setPriceHistory(ArrayList<Double> priceHistory) {
        this.priceHistory = priceHistory;
    }
    
}
