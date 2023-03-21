问题：
编写一个矩形类Rectangle和一个主类Tester，求解一个矩形的面积（getArea）和周长（getGirth），并显示结果（主类中只需调用矩形类的方法，获取矩形的面积和周长）。
package MyPackage;

import java.math.*;

import java.util.Scanner;

class getArea{

       double area;

       public getArea(double  a,double  b) {

              area = a*b;

  System.out.println("矩形的面积是:"+area);

       }

}

class getGirth{

       double girth;

       public getGirth(double  a,double  b) {

              girth = 2*(a+b);

  System.out.println("举行的周长是:"+girth);

       }

}

public class HelloWorld {

       public static void main(String[] args) {

       double a,b;

       Scanner input = new Scanner(System.in);

       a=input.nextDouble();

       b=input.nextDouble();

       getArea x = new getArea(a,b);

       getGirth y = new getGirth(a,b);

}

}
