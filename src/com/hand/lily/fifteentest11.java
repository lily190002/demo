package com.hand.lily;

//泛型方法的使用
class Gener{
    //泛型方法
    public  <T> T tell(T t){
        return t;
    }
}


public class fifteentest11 {
    public static void main(String[] args){
    Gener g=new Gener();
    String str =g.tell("今天好无聊啊😭");
    System.out.println(str);
    }
}
