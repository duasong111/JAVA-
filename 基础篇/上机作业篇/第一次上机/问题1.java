//（1）设x=2.5，y=4.7，a=7，求解x+a%3*(int)(x+y) %2 / 4 的值。
//设a=2，b=3，x=3.5，y=2.5，求解(float)(a+b)/2 – (int)x % (int)y的值。
package MyPackage;
public class HelloWorld {
       public static void main(String[] args) {
       double x,y,sum=0;

       int a;

       x=2.5;

       y=4.7;

       a=7;

       sum=x+a%3*(int)(x+y)%2/4;             

System.out.println("x+a%3*(int)(x+y) %2 / 4的结果是:"+sum);

}

}
