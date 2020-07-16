package com.hand.lily;

class Person{
    String name;
    int age;
    //创建一个方法
    public  void tell(){
        System.out.println("姓名是："+name+",年龄是："+age);
    }
}


public class fifteentest01 {
    public static void main(String[] args){
        //声明并实例化对象
        Person per=new Person();
        per.name="毛毛";
        per.age=21;
        per.tell();
    }
}
