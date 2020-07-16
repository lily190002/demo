package com.hand.lily;

//接口里面只有抽象方法，一般可以省略abstract
interface  Gen<T>{
    public  void  say();
}

class  Gendemo implements  Gen<String>{
    private  String info;
    //创建一个构造方法
    public  Gendemo(String info){
        this.info=info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void say() {

    }
}
public class fifteentest10 {
    public static void main(String[] args){
    Gendemo g= new Gendemo("hand");
        System.out.println(g.getInfo());
    }
}
