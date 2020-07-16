package com.hand.lily;

class  Point<T,K>{
    private T take;
    private K key;

    public T getTake() {
        return take;
    }

    public void setTake(T take) {
        this.take = take;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
public class fifteentest08 {
    public static void main(String[] args){
        Point<String,Integer> p=new Point<>();
        p.setTake("妲己");
        p.setKey(22);
        System.out.println("王者里面的"+p.getTake()+"杀了"+p.getKey()+"个敌人");
    }
}
