package org.findjar.test;

/**
 * Created by Administrator on 2014/12/30.
 */
public class Counter {
    // 总数
    private static int totalCount = 0;

    public int add(Integer num) throws Exception {
        totalCount += num;
        sleep();
        return totalCount;
    }

    public void sleep() throws Exception {
        Thread.sleep(1000);
    }

    public static void main(String[] args) {
        String[] s = {"aaaa", "bbbbb", "workflow"};
        for(String r : s) {
            // 断点条件变量："workflow".equalsIgnoreCase(r)
            System.out.println(r);
        }
    }
}
