package com.ngocnv.com.ngocnv.cleanCode.functions.solution;

public class CommissionedEmployee implements IEmployee {
    @Override
    public boolean isPayDay() {
        return false;
    }

    @Override
    public Double calculatePay() {
        return null;
    }

    @Override
    public void deliveryPay(Double money) {

    }
}
