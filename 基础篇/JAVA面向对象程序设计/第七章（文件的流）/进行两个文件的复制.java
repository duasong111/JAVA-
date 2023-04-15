//对文件的复制操作
import java.awt.*;
import java.util.Scanner;
import java.util.*;
import  java.io.*;
import javax.jws.*;
import javax.swing.*;
//对文件进行复制
public class Main {
   public static void main(String[] args){
       InputStream is = null;
       OutputStream os = null;
       try{
           is=new FileInputStream("d:/a.txt");
           os=new FileOutputStream("d:/b.txt");
           byte[] bs= new byte[1024]; //储存在数组里
           int len;
           while((len=is.read(bs))!=-1){ //只要a没有结束就继续将他的值复制到b中
               os.write(bs,0,len);
           }
       }catch (Exception e){
           e.printStackTrace(); //输入异常
       }finally {
           try{
               if(is!=null)
                   is.close();
               if (os!=null)
                   os.close();
           }catch (IOException e){ //前边害怕有异常，输入输出异常
               e.printStackTrace();
           }
       }
       
     }
   }
