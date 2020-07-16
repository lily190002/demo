package com.hand.lily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Iterator遍历数组
public class fifteentest14 {
    public static void main(String[] args){
        List<String> lis=new ArrayList<>();
        lis.add("A");
        lis.add("B");
        lis.add("C");
        lis.add("D");
        lis.add("E");
        lis.add("F");
        lis.add("G");
        Iterator<String> it=lis.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
