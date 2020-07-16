package com.hand.lily;

class Person05{
  private   String name;
   private int age;

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
}


class Student extends Person05{
   private int score;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public  void say(){
        System.out.println("姓名是："+getName()+",年龄是："+getAge()+",成绩是："+getScore());
    }
}


public class fifteentest05 {
    public static void main(String[] args){
    Student s=new Student();
    s.setName("宝贝");
    s.setAge(22);
    s.setScore(99);
    s.say();
    }
}
