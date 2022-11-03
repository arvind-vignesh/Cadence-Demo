package com.cadence.sample.cadenceSample.POJO;

public class Employee {
    private Asset asset;
    private Benefits benefits;
    private Compensation compensation;
    private Payroll payroll;
    private Training training;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "asset=" + asset +
                ", benefits=" + benefits +
                ", compensation=" + compensation +
                ", payroll=" + payroll +
                ", training=" + training +
                '}';
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public Payroll getPayroll() {
        return payroll;
    }

    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
