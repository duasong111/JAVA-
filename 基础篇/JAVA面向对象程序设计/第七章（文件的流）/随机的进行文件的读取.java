import java.awt.*;
import java.util.Scanner;
import java.util.*;
import  java.io.*;
import javax.jws.*;
import javax.swing.*;
//随机的进行文件的读取
public class Main {
   public static void main(String[] args){
     RandomAccessFile fileHandle = null;
     try{
         int []data={100,200,300,400,500,600,700,800,900,1000};
         fileHandle = new RandomAccessFile("d:/a.txt","rw"); //在D盘中创建一个文件
         for(int i=0;i<data.length;i++)
             fileHandle.writeInt(data[i]); //将这些数据写入D盘中
         fileHandle.seek(4);
       System.out.println(fileHandle.readInt());
       for(int i=0;i<2;i++){
           fileHandle.seek(i*4);
           System.out.println(fileHandle.readInt()+" ");
       }
       System.out.println();
       fileHandle.seek(8); //这个是倒数的呀
       fileHandle.writeInt(350);
       for(int i=0;i<10;i++){
           fileHandle.seek(i*4);
           System.out.println(fileHandle.readInt()+" ");
       }
     }catch(IOException e){
         e.printStackTrace();
     }finally {
         if(fileHandle!=null){
             try{
                 fileHandle.close();
             }catch (IOException e){
                 e.printStackTrace();
             }
         }
     }
     }
   }
