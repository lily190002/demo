package com.hand.lily;

public class fifteentest02 {
    public static void main(String[] args){
        System.out.println(addNumber(100));
    }
    //递归调用，算数100+99+。。。。1
    public  static  int addNumber(int num){
        if (num==1){
            return 1;
        }else{
            return  num+addNumber(num-1);
        }
    }
}
