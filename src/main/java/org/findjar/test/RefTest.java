package org.findjar.test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Collections;

/**
 * Created by Administrator on 2015/1/4.
 */
public class RefTest {

    public Object test() throws Exception {
        InputStream in;
        OutputStream out;
        InputStreamReader inReader;
        Collections collections;


        Class counterClazz = Class.forName("org.findjar.test.Counter");
        Object obj = counterClazz.newInstance();

        Method addMethod = counterClazz.getMethod("add", new Class[] {Integer.class});
        Object rs = addMethod.invoke(obj, new Object[] { 10 });
        System.out.println(rs);

        Thread.sleep(1 * 1000);
        return rs;
    }

    public static void main(String[] args) throws Exception {
        // com.ibatis.common.beans.MethodInvoker c;

        // sun.reflect.DelegatingClassLoader c;


        for(int i = 0; i < 100000000; i++) {
            new RefTest().test();
        }
    }
}

