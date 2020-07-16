package com.hand.lily;

//泛型数组的练习
public class fifteentest12 {
    public static void main(String[] args){
        String  arr[]={"12","33","53","3"};
    }
    public  static <T> void  tell(T arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
