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
 * @author mridulregmi
 */
public class CompanyManager extends AppUser{
    private ArrayList<Company> companyList;
    public CompanyManager(){
        super();
        this.companyList=new ArrayList<>();
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
    
    
}
