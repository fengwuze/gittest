package org.findjar.test;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2014/12/23.
 */
public class Test<T, K> {

    public void t1(T t) {
        System.out.println(t);
    }

    public void k1(K t) {
        System.out.println(t);
    }

    public <Y> void s1(Y y) {
        System.out.println("y: "+ y);
    }

    static class OOMObject {
        byte[] b = new byte[1024*1024];
    }

    public static void main(String[] args) {
        List<OOMObject> s = new ArrayList<OOMObject>();
        int i = 1;
        while(true) {
            if((i++ % 10) == 0) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            s.add(new OOMObject());
        }
    }
}
