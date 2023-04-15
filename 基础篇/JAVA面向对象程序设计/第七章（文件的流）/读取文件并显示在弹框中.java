import java.awt.*;
import java.util.Scanner;
import java.util.*;
import  java.io.*;
import javax.jws.*;
import javax.swing.*;
//读取文件并将文件输出在弹框中
public class Main {
   public static void main(String[] args){
       File file = new File("d:/a.txt"); //找到文件的路径
       try{
           FileInputStream fis = new FileInputStream(file); //Input 是读
           int len; //为啥来去定义一个整数呢？ 因为后续你是采用的ASCLL来去存储的
           byte by[]= new byte[1024];
           while((len=fis.read(by))!=-1){
               for (int i=0;i< file.length();i++){ //利用for循环来去记录那个所有单字符的长度
                   String str = new String(by,i,1);//每次就从遍历的i开始，每次只走一格
                   System.out.println("文件读取的内容单字符输出:"+str);
               }

//               String str = new String(by,0,len);
//               System.out.println("文件读取的内容单字符输出:"+str);
           }
           fis.close();
       }catch(Exception e){
           e.printStackTrace();
       }
     }
   }
