package com.payroll.payroll;

public class Payroll {
    private String basePay;
    private String PF;
    private String Other;

    public Payroll() {
    }

    public String getBasePay() {
        return basePay;
    }

    public void setBasePay(String basePay) {
        this.basePay = basePay;
    }

    public String getPF() {
        return PF;
    }

    public void setPF(String PF) {
        this.PF = PF;
    }

    public String getOther() {
        return Other;
    }

    public void setOther(String other) {
        Other = other;
    }
}
