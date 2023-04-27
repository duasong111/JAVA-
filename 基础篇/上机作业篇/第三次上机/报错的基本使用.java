import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
class  Triangle{
    int a,b,c;
    public Triangle(int a,int b,int c){
   this.a=a; //重写
        this.b=b;
        this.c=c;
    }
    void sanjiao(){ //此时的a，b，c相当于这个定域内中
    try{ //对异常进行处理
        if(a+b<=c||a+c<=b||b+c<=a){
            throw  new IllegalAccessError(); //异常类的处理
        }
        else{ //这都是符合规范的
            System.out.println("能构成三角形");
            System.out.println("a=" + a + ",b=" + b + ",c=" + c);
            System.out.println("周长为" + (a + b + c));
            double p=(a+b+c)/2;
            double s=(p-a)*(p-b)*(p-c)*p;
            double s1=Math.pow(s,0.5);
            System.out.println("面积为"+s1);
        }
    }catch(IllegalAccessError e){//对异常类的处理
        System.out.println(a + "," + b + "," + c + "不能构成三角形");
        }
    }


}
class test{
    public  void tset(){
        System.out.print("输入a b c");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        Triangle x =new Triangle(a,b,c);
        x.sanjiao(); //再转入
    }
}
public class Main {
    public static void main(String[] args) {
        test m= new test(); //开辟一个空间
        m.tset();
    }
}
