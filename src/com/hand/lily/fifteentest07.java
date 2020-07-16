package com.hand.lily;

//usb接口
interface  Usb{
    void start();
    void stop();
}

//电脑
class C{
    public  static  void work(Usb u){
        u.start();
        System.out.println("工作中");
        u.stop();
    }
}

//U盘
class  UsbDisk implements  Usb{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
//打印机
class Print implements  Usb{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}


public class fifteentest07 {
    public static void main(String[] args){
    C.work(new UsbDisk());
    C.work(new Print());
    }
}
