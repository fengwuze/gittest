package org.findjar.test;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2015/1/20.
 */
public class FindExample {

    public static void main(String[] args) {
        long st = System.nanoTime();

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
                    System.out.println("\n\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("1418626436000: "+sdf.format(new Date(1418626436000L)));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(Timestamp.valueOf("2015-01-26 22:00:00").getTime());
        System.out.println(Timestamp.valueOf("2015-01-27 22:00:00").getTime());
        System.out.println("");
        System.out.println(StringUtils.rightPad("aa", 20, " "));
        System.out.println(System.identityHashCode(sdf));
        System.out.println(System.identityHashCode(sdf));
        System.out.println(System.identityHashCode(sdf2));

        long en = System.nanoTime();
        System.out.println("scan time: " + (en - st)/1000000);
    }
}
