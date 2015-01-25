package org.findjar.eof.strategy;

/**
 * Created by Administrator on 2014/12/27.
 */
public class BillingFactory {

    public static Billing newInstall(int type) {
        switch (type) {
            case 0: return new Billing();
            case 5: return new BillingRebate(0.5D);
            case 8: return new BillingRebate(0.8D);
            case 300: return new BillingReturn(300, 100);
            default: return new Billing();
        }
    }
}
