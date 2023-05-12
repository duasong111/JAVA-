
package test;
import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入账户:");
        String admin= scanner.next();
        System.out.printf("请输入密码:");
        int contents = scanner.nextInt();

       //如果不是用equal去进行比较的话，就算输入的正确则显示也是不正确的
        if (admin.equals("admin") && contents==123) {
            System.out.printf("恭喜你输入正确");
        } else
            System.out.printf("输入错误");
        //java起初是都在一块，然后去区分类进行多个
    }
}



  //java起初是都在一块，然后去区分类进行多个
       double  num= Math.random()*100;
       //因为那个random的方法产生的数字是0--1的一个实数，你若换化为整数则肯定是0
        System.out.printf("num的值是:"+num);
        if (num>0.5){
            System.out.printf("这个数大于0.5");
        }



package test;
import java.io.IOException;
import  java.util.Scanner;
public class class_test {
    public static void main(String[] args)throws IOException {
        Scanner scanner=new Scanner(System.in);

        String s = scanner.next();
        if (comp(s)){
            System.out.printf(s+"是回文数！！");
        }else {
            System.out.printf(s+"不是回文数！！");
        }

    }
    public  static boolean comp(String s){
        int i=0;
        //toCharArray的作用是将字符串转化为字符串数组
        char[] charArray=s.toCharArray();
        while(i<s.length()/2){
            if (charArray[i]!=charArray[s.length()-1-i]){
                return false;
            }
              i++;
        }
        return  true;
    }
}
