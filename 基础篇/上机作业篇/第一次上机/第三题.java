package MyPackage;

import java.math.*;

import java.util.Scanner;

class count{

       double area;

       public count(double  a,double  b,double  c) {      

              double  p;

              p=(a+b+c)/2;

              area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

  System.out.print("输出:"+area);

       }

}

public class HelloWorld {

       public static void main(String[] args) {

       double a,b,c,p,area,s;

       Scanner input = new Scanner(System.in);

       a=input.nextDouble();

       b=input.nextDouble();

       c=input.nextDouble();

       count x = new count(a,b,c);

}

}
