package com.hand.lily;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class fifteentest15 {
    public static void main(String[] args){
        Map<String,String> m=new HashMap<>();
        m.put("1","A");
        m.put("2","B");
        m.put("3","C");
        m.put("4","D");
        m.put("5","E");
        m.put("6","F");
        Set<String> s=m.keySet();
        Iterator<String> i=s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
