package org.findjar.test;

/**
 * Created by Administrator on 2014/12/25.
 */
public class StringInternOOM {

    public static void main(String[] args) {
        int size = 10000000;
        //String[] array = new String[size];
        for(int i = 0; i < size; i++) {
            //array[i] =
            String.valueOf(i).intern();
        }
    }
}
