import java.util.Scanner;
import java.util.*;
interface A{
    static double PI = 3.14;
    abstract double area(); //接口中的抽象类
}
interface B{

    abstract void setColor(String c); //接口中的抽象类
}
interface C extends A,B{
    abstract void volume();
}
class Cylinder implements C{
    double radious;
    int height;
    String color;
    public void setColor(String color){
        this.color = color;
        System.out.println("当前圆柱的颜色:"+color);
    }

    public void volume(){

        System.out.println("当前圆柱的体积:"+PI*radious*radious*height);
    }

    public double area(){

        System.out.println("当前圆柱的面积:"+2*PI*radious*radious+2*PI*radious*height);
        return 0;
    }
}
public class Main {
   public static void main(String[] args){
       Cylinder cylinder = new Cylinder();
       cylinder.height=15;
       cylinder.radious=3.3;

       cylinder.area();
       cylinder.setColor("绿色");
       cylinder.volume();
   }
}
