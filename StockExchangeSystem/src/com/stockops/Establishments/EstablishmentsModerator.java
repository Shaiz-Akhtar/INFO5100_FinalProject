/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

import com.stockops.Users.AppUser;
import java.util.ArrayList;

/**
 *
 * @author Shaiz
 */
public class EstablishmentsModerator extends AppUser{
    private Establishment establishment;
    private ArrayList<Company> companyList;
    private ArrayList<CompanyManager> companyManagerDirectory;
    private ArrayList<InvestmentManager> investmentManagerDirectory;
    private double smallCap;
    private double mediumCap;
    private double largeCap;
    public EstablishmentsModerator(){
        super();
        companyList = new ArrayList<>();
        companyManagerDirectory=new ArrayList<>();
        investmentManagerDirectory=new ArrayList<>();
        
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
    
    public Company getCompanyByName(String name){
        for(Company company: this.companyList){
            if(company.getName().equals(name)){
                return company;
            }
        }
        return null;
    }

    public ArrayList<CompanyManager> getCompanyManagerDirectory() {
        return companyManagerDirectory;
    }

    public void setCompanyManagerDirectory(ArrayList<CompanyManager> companyManagerDirectory) {
        this.companyManagerDirectory = companyManagerDirectory;
    }

    public ArrayList<InvestmentManager> getInvestmentManagerDirectory() {
        return investmentManagerDirectory;
    }
    
    public InvestmentManager getInvestmentManagerByName(String name){
        for(InvestmentManager investmentManager: this.investmentManagerDirectory){
            if(investmentManager.getName().equals(name)){
                return investmentManager;
            }
        }
        return null;
    }

    public void setInvestmentManagerDirectory(ArrayList<InvestmentManager> investmentManagerDirectory) {
        this.investmentManagerDirectory = investmentManagerDirectory;
    }

    public double getSmallCap() {
        return smallCap;
    }

    public void setSmallCap(double smallCap) {
        this.smallCap = smallCap;
    }

    public double getMediumCap() {
        return mediumCap;
    }

    public void setMediumCap(double mediumCap) {
        this.mediumCap = mediumCap;
    }

    public double getLargeCap() {
        return largeCap;
    }

    public void setLargeCap(double largeCap) {
        this.largeCap = largeCap;
    }
    
    
}
