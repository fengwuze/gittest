package org.findjar.test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * Created by Administrator on 2014/12/28.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        // sun.reflect.DelegatingClassLoader l;
        // ClassLoader.defineClass;

        int i = 0;
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(o, objects);
                }
            });
            enhancer.create();

            if(i++ % 300 == 0) {
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    static class OOMObject {

    }
}
