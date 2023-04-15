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
       String filepath ="d:/b.txt";
    Scanner src = new Scanner(System.in);
       File file = new File(filepath);

       try{
       if (file.createNewFile()) {
           System.out.println("创建文件成功！");
       } else {
           System.out.println("文件已经存在不需要重复创建");
       }

       // 使用FileWriter写文件
       try (FileWriter writer = new FileWriter(file)) {
           String sss=src.next();
           writer.write("Hello World -创建文件!!"+sss);
       }catch (IOException e){
           e.printStackTrace();
       }

     }catch (IOException e){
           e.printStackTrace();
       }
   }
}
