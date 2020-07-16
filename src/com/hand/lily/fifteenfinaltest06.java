package com.hand.lily;


abstract class Abs{
    private  int age;
    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //抽象方法
    public  abstract  void tell0();
    public  abstract  void say();
}

  class  AbsDemo extends  Abs{
      @Override
      public void tell0() {
          System.out.println("我叫"+getName());
      }
      @Override
      public void say() {
          System.out.println("今年"+getAge()+"岁");
      }
  }

public class fifteenfinaltest06 {
    public static void main(String[] args){
     AbsDemo ad=new AbsDemo();
     ad.setName("抽象类");
     ad.setAge(22);
     ad.tell0();
     ad.say();
    }
}
