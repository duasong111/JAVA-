//获取文件的文件名，父路径 长度以及可读的信息
import java.awt.*;
import java.util.Scanner;
import java.util.*;
import  java.io.*;
import javax.jws.*;
import javax.swing.*;
//随机的进行文件的读取
public class Main {
   public static void main(String[] args){
     File file = new File("d:/a.txt");//创建一个文件fiel对象
       if(file.exists()){//这个其实不是创建一个文件而是开辟一个空间，然后相当于连接到你的地址然后进行后续操作
           String name= file.getName(); //得到文件的名字
           String parent = file.getParent();//得到其目录
           long leng= file.length();
           long TIme11 = file.lastModified();

           System.out.println("这个文件的名称:"+name);
           System.out.println("这个文件的目录:"+parent);
           System.out.println("这个文件的长度:"+leng);
           System.out.println("这个文件最后被修改的时间是:"+TIme11); //显示的不是正确的时间
       }
     }
   }
