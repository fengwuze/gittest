package org.findjar.eof.strategy;

/**
 * 满足指定条件，返现
 */
public class BillingReturn extends Billing {

    private double condition;
    private double returnCach;

    public BillingReturn(double condition, double returnCach) {
        this.condition = condition;
        this.returnCach = returnCach;
    }

    @Override
    public double accept(double cash) {
        if(cash >= condition) {
            cash = cash - returnCach;
        }
        return cash;
    }
}
