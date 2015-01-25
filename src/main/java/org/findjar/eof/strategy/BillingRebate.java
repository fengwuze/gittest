package org.findjar.eof.strategy;

/**
 * Created by Administrator on 2014/12/27.
 */
public class BillingRebate extends Billing {

    private double rebate;

    public BillingRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double accept(double cash) {
        return cash * rebate;
    }
}
