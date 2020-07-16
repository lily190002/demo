package com.hand.lily;

class  Person03{
    //属性私有化需要创建get和set方法
    private String name;
    private int age;

    //属性的get和set方法
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
        if (age>=0&&age<200){
            this.age = age;
        }
    }
    //创建一个方法
    public  void tell(){
        System.out.println("姓名是："+getName()+",年龄是："+getAge());
    }
}

public class fifteentest03 {
    public static void main(String[] args){
        //声明对象并实例化
        Person03 per=new Person03();
        //对象设置值
        per.setName("李可");
        per.setAge(22);
        //调用方法
        per.tell();
    }
}
