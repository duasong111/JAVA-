package com.company;
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

//实现用户的登录页面
public class Main {
    public static void main(String[] args) {
        //去申请一个空间
//        MyThread  thread1= new MyThread("Mythread1");
//        MyThread  thread2= new MyThread("Mythread2");
//        thread1.start();
//        thread2.start();
      
      
      //采用Runnable 接口来实现多线程
      //其实在这个里边的那个 thread也是对于那个Runable的一个接口多定义的
//
        MyThread T1 = new MyThread("Mythread1");
        MyThread T2 = new MyThread("Mythread2");
        Thread thread1 = new Thread((Runnable) T1);
        Thread thread2 = new Thread((Runnable) T2);
        thread1.start();
        thread2.start();

    }
}
//关键字的extend是继承的关系
//abstract是抽象类
//则对于接口则是: public| abstract interface 接口名[extends 接口列表】
//这个是属于运用其子类来进行实现多线程的操作
//    class  MyThread extends Thread{
//        String str= null;
//        public MyThread(String str){
//            this.str=str; //这俩str是不一样的，一个自定义的一个是传入的数值
//        }
//        public void run(){
//            for (int i=0;i<3;i++){
//                System.out.printf("输入的参数"+str+'\n');
//                try{
//                    Thread.sleep(100);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
class MyThread implements Runnable{
    String str= null;
    public MyThread(String str){
        this.str= str;
    }
    public void run(){
        for (int i=0;i<3;i++){
            System.out.printf("输出参数"+str);
            try{
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

