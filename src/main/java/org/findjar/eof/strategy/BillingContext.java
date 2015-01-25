package org.findjar.eof.strategy;

/**
 * Created by Administrator on 2014/12/27.
 */
public class BillingContext {

    private Billing billing;

    public BillingContext(int type) {
        switch (type) {
            case 0: billing = new Billing(); break;
            case 5: billing = new BillingRebate(0.5D); break;
            case 8: billing = new BillingRebate(0.8D); break;
            case 300: billing = new BillingReturn(300, 100); break;
            default: billing = new Billing(); break;
        }
    }

    public double getResult(double money) {
        return billing.accept(money);
    }
}
