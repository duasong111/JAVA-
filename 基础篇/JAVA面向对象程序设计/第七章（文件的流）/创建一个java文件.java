import java.util.Scanner;
import java.util.*;
import java.io.*; //这个是对文件的输入输出流的包
//java文件输入输出流的操作

public class Main {
   public static void main(String[] args){

    InputStream is= System.in; //新版的输入
    try{  //设置异常捕获
        byte[]bs=new byte[1024]; //开辟自己缓冲区
        int len = is.read(bs); //从标准输入流中来进行对象的读取字节   *为啥要去记录这个len的长度呢？？？
        String str = new String(bs); //创建一个String的对象
        System.out.println("输入内容:"+str);
        is.close();
    }catch (IOException e){
        e.printStackTrace(); //将异常栈打印值标准的错误流
       }
     }
   }
