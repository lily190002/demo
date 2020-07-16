package com.hand.lily;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args){
        //创建scanner对象
        Scanner scanner =new Scanner(System.in);
        System.out.println("姓名:");
        String name=scanner.next();
        System.out.println("性别：");
        char sex=scanner.next().charAt(0);
        System.out.println("年龄：");
        int age=scanner.nextInt();
        System.out.println("身高：");
        float height=scanner.nextFloat();
        System.out.println("嗨，大家好！我叫"+name+"，今年"+age+"岁"+"身高"+height);
    }
}
