package com.ngocnv.cleanCode.functions.example1.solution;

public class HourlyEmployee implements IEmployee {
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
