package com.finance.finance;

public class Employee {
    private Compensation compensation;
    private Stocks stocks;

    public Employee() {
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public Stocks getStocks() {
        return stocks;
    }

    public void setStocks(Stocks stocks) {
        this.stocks = stocks;
    }
}
