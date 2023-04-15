import java.awt.*;
import java.util.Scanner;
import java.util.*;
import  java.io.*;
import javax.jws.*;
import javax.swing.*;
//用户组件的使用
public class Main {
   public static void main(String[] args){
     JFrame win = new JFrame(); //创建一个窗口的对象
      win.setLayout(null);//设置空布局
       win.setSize(580,480);
       win.setLocation(400,500);
       win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       win.setTitle("java测试面板工具");
       JPanel p1 = new JPanel(); //面板
       JPanel p2 = new JPanel();
       JButton b1 = new JButton("按钮1");
       JButton b2 = new JButton("按钮2");
       p1.add(b1);//在这套娃呢
       p1.setLocation(5,10);
       p1.setSize(80,60);
       p1.setBackground(Color.red);

       p2.add(b2);//在这套娃呢
       p2.setLocation(40,50);
       p2.setSize(80,60);
       p2.setBackground(Color.gray);
    win.add(p1);
    win.add(p2);
       win.setVisible(true);//显示面板是可见的
     }
   }
//以上是采用java的ui设计页面，我会对其进行更改的


