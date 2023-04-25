package com.company;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

//滚动条
public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("输入框Demo");
        f.setLayout(null);

        f.setSize(300,400);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//对退出按钮点击之后会进行退出的操作

        JTextArea tal=new JTextArea();//创建一个空的文本框
        tal.setLocation(5,5);
        tal.setSize(140,40);

        JTextArea ta2= new JTextArea("初始文字");
        ta2.setLineWrap(true); //文本框进行自动换行功能
         JScrollPane sp=new JScrollPane(ta2); //将ta2来作为显示的页面
        sp.setLocation(5,50);

        sp.setSize(140,70);
        f.add(tal);
        f.add(sp);



        f.setVisible(true);

    }
}
