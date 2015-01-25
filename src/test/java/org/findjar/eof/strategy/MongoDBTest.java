package org.findjar.eof.strategy;

import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 复制集测试代码
 */
public class MongoDBTest {

    public static void main(String[] args) {
        try {
            List<ServerAddress> addresses = new ArrayList<ServerAddress>();
            ServerAddress address1 = new ServerAddress("172.17.108.11" , 28010);
            ServerAddress address2 = new ServerAddress("172.17.108.11" , 28011);
            ServerAddress address3 = new ServerAddress("172.17.108.11" , 28012);

            addresses.add(address1);
            addresses.add(address2);
            addresses.add(address3);

//            MongoClient client = new MongoClient(addresses);
//            DB db = client.getDB( "usertable");
//            DBCollection coll = db.getCollection( "testdb");
//
//            // 插入
//            BasicDBObject object = new BasicDBObject();
//            object.append( "test2", "testval2" );
//
//            coll.insert(object);
//
//            ReadPreference preference = ReadPreference. secondary();
//            System.out.println(coll.findOne(object, null, preference));
//
//            DBCursor dbCursor = coll.find();
//
//            while (dbCursor.hasNext()) {
//                DBObject dbObject = dbCursor.next();
//                System. out.println(dbObject.toString());
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
