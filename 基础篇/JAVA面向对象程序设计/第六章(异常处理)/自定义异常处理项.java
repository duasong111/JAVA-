import java.util.Scanner;
import java.util.*;
//自定义异常类的使用
class MyException extends Exception{
    private int len;
    public MyException(String n){
        len=n.length(); //上一个使用的是n.length后边是没有括号的
    }
    public String toString(){
        return ("字符串的长度为:"+len+"超出了允许的最大长度，出现了异常");
    }
}

public class Main {
   public static void main(String[] args){
     String str="好好学习天天向上";
     try{  //害怕有异常，于是在这来进行了一个异常处理
         System.out.println("这是一个异常的例子");
         if(str.length()>7)
             throw  new MyException(str); //抛出异常
     }catch (MyException e){ //来对抛出的异常进行捕获
         System.out.println(e.toString()); //用来声明异常 然后转接到了上边自己所定义的类中
        }
      }

   }
