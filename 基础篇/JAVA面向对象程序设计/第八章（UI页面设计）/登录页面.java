用户登录界面的设置
package com.company;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

//实现用户的登录页面
public class Main {

    public static void main(String[] args) {

        JFrame f=new JFrame("输入框Demo");
        f.setSize(300,400);
        f.setResizable(false); //这个是窗口是不可以移动的
        f.setLayout(new FlowLayout());
        JLabel labelUsername= new JLabel("用户名");

        JTextField tfdUsernamr= new JTextField(10);
        JPanel p1= new JPanel();
        p1.add(labelUsername);
        p1.add(tfdUsernamr); //都添加到面板中
         JLabel labelPWD= new JLabel("密码");
         JPasswordField pdf= new JPasswordField(10); //限制输出长度

        pdf.setEchoChar('*'); //采用星号来去代表输入的密码内容
        JPanel p2= new JPanel();
        p2.add(labelPWD);
        p2.add( pdf);
        JButton btnLogin = new JButton("登录");
        JButton btnClose = new JButton("退出");

        JPanel p3=new JPanel();
        p3.add(btnLogin);
        p3.add(btnClose);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
}
