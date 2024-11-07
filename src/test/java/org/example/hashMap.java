package org.example;

import org.codehaus.groovy.util.SingleKeyHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class hashMap {
    public static void main(String[] args) {
        Map <Integer,String> hashmap =new HashMap();
        hashmap.put(001,"Saritha");
        hashmap.put(002,"Satya");
        hashmap.put(003,"Harsha");
        hashmap.put(004,"Lohi");
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());
        System.out.println(hashmap.entrySet());
        for(int k: hashmap.keySet())
        {
            System.out.println(hashmap.get(k));
        }
        //itertor
//        Iterator <Entry<Integer,String >> it= hashmap.entrySet().iterator();
//        while(it.hasNext()) {
//            Entry<Integer, String> entry = it.next();
//            entry.getKey();
//            entry.getValue();
//        }

        //Arraylist -duplicates, Heterogenous, order preserce, allow multiple nulls -LinkedLlist
        //HashSet - no order, no duplicates, heterogenours, only one null - Set
        //HashMap -unique keys, duplicate values ; key value pair ; Iterator - keyset, value, entryset

        }

    }
