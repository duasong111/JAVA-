import java.awt.*;
import java.util.Scanner;
import java.util.*;
import  java.io.*;
import java.util.Scanner;
import javax.jws.*;
import javax.swing.*;
//尝试去创建一个文件，并向文件写入内容
public class Main {
   public static void main(String[] args){
      InputStream is=System.in;
      try{
          byte[]bs = new byte[1024];
          int len = is.read(bs);
          String str=new String(bs);
          System.out.println("输入的内容是:"+str);
          is.close();
      }catch (IOException e){
          e.printStackTrace();
      }
   }
}
