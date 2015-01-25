package org.findjar.test;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2015/1/20.
 */
public class FindSimaple {

    public static void main(String[] args) {
        String key = "time";

        File f = new File("D:\\btrace-bin\\btrace~hg\\samples");
        for(File txt : f.listFiles()) {
            try {
                String txtContext = IOUtils.toString(new FileInputStream(txt));
                if(txtContext.contains(key)) {
                    System.out.println("File name: " + txt.getName());

                    LineIterator iter = IOUtils.lineIterator(new FileInputStream(txt), "UTF-8");
                    while(iter.hasNext()) {
                        System.out.println(iter.next());
                    }
                    System.out.println("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
