package org.findjar.test;

import java.util.Random;

/**
 * Created by Administrator on 2014/12/30.
 */
public class TestBtrace {

    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // 计数器
        Counter counter = new Counter();
        while (true) {
            // 每次增加随机值
            counter.add(random.nextInt(10));
            Thread.sleep(1000);
        }
    }
}


