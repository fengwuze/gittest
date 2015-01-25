package org.findjar.test;

import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2014/12/25.
 */
public class Utf8 {

    public void tt() {}

    public static void main(String[] args) {
        Set<Map.Entry<Object,Object>> s = System.getProperties().entrySet();
        for(Map.Entry<Object, Object> r : s) {
            System.out.println(r.getKey() + " = " + r.getValue());
        }
    }
}
