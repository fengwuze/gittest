package org.findjar.test;

/**
 * Created by Administrator on 2014/12/25.
 */
public class GCTest {

    public static void main(String[] args) throws Exception {
        byte[] alloc1,alloc2,alloc3,alloc4,alloc5;
        alloc1 = new byte[2*1024*1024];
        Thread.sleep(2000);
        alloc2 = new byte[2*1024*1024];
        Thread.sleep(2000);
        alloc3 = new byte[2*1024*1024];
        Thread.sleep(2000);
        alloc4 = new byte[2*1024*1024];
        Thread.sleep(2000);

        System.out.println("ddddd");
		System.out.println("ddddd");
    }
}
