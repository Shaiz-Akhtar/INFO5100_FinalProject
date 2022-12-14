/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

/**
 *
 * @author Shaiz
 */
public class JobRequest {
    private InvestmentManager applicant;
    private Company company;
    private double salaryRequest;
    private int experience;
    public JobRequest(){
        
    }

    public void setApplicant(InvestmentManager applicant) {
        this.applicant = applicant;
    }

    public InvestmentManager getApplicant() {
        return applicant;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalaryRequest() {
        return salaryRequest;
    }

    public void setSalaryRequest(double salaryRequest) {
        this.salaryRequest = salaryRequest;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    
}
