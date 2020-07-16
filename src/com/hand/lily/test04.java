package com.hand.lily;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入分数：");
        double score=scanner.nextDouble();
        boolean ispass=score>=60;
        System.out.println(score+"及格:"+ispass);

    }
}
