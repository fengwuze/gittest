package org.findjar.eof.strategy;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2014/12/27.
 */
public class BillingTest {

    @Test
    public void testNoDiscount() {
        BillingContext context = new BillingContext(0);

        double cost = context.getResult(2000);
        assertEquals("无折扣销售测试失败", 2000.0D, cost, 0);
    }

    @Test
    public void test5Discount() {
        BillingContext context = new BillingContext(5);

        double cost = context.getResult(2000);
        assertEquals("5折销售测试失败", 1000.0D, cost, 0);
    }

    @Test
    public void test8Discount() {
        BillingContext context = new BillingContext(8);

        double cost = context.getResult(2000);
        assertEquals("8折销售测试失败", 1600.0D, cost, 0);
    }

    @Test
    public void test300Discount() {
        BillingContext context = new BillingContext(300);

        double cost = context.getResult(2000);
        assertEquals("满300减100销售测试失败", 1900.0D, cost, 0);
    }
}
