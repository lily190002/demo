package com.hand.lily;

class Info<T>{
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return this.getKey().toString();
    }
}


public class fifteentest09 {
    public static void main(String[] args){
        Info<String> i=new Info();
        i.setKey("猪猪猪猪猪猪猪猪~");
        tell(i);
    }

    //通配符：？可以不用指定类型，在实例化的时候再指定
    public  static void  tell(Info<?> i){
        System.out.println(i);
    }
}
