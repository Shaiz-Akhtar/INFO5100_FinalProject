/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

import com.stockops.Users.AppUser;

/**
 *
 * @author mridulregmi
 */
public class InvestmentManager extends AppUser{
    private double salary;
    private float experience;
    private Company assignedCompany;
    public InvestmentManager(){
        super();
        assignedCompany=null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Company getAssignedCompany() {
        return assignedCompany;
    }

    public void setAssignedCompany(Company assignedCompany) {
        this.assignedCompany = assignedCompany;
    }
    
            
}
