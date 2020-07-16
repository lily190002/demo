package com.hand.lily;

class People{
    private String name;
    private int age;
    //带参的构造方法
    public  People(String name,int age){
        //this必须放在构造方法最前面
        this();
        this.name=name;
        this.age=age;
    }

    //无参的构造方法
    public  People(){
        System.out.println("这是一个无参的构造方法");
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //创建一个方法
    public  void tell(){
        System.out.println("姓名是："+this.getName()+",  年龄是："+this.getAge());
    }
}
public class fifteentest04 {
    public static void main(String[] args){
        //声明对象并实例化
        People pe= new People("王三",31);
        pe.tell();
    }
}
