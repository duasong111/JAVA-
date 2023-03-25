例题5.3.1
import java.util.Scanner;
//接口的实现

//implement 和extends的区别是：
//implement是为了实现接口的操作
//这个是为了继承那个子父继承的关系
 interface PCI{
     void setName(String s); //在子窗口中被重写所重新定义
     void run();
}
  class VideoCard implements PCI{
     String name="微星";
     public void setName(String s){
         name=s;
     }
     public void run(){
         System.out.println(name+"显卡已经开始工作了");
     }
}
 class SoundCard implements PCI{
    String name="AC";
    public void setName(String s){
        name=s;
    }
    public void run(){
        System.out.println(name+"声卡已经开始工作了");
    }
}

class Mainboard{ //在此创建出自己的一个类
     public void interfacePCI(PCI p){  //多态的使用
         p.run();
     }
     public void run(){
         System.out.println("主板已经开始工作了");
     }
}
public class Main {

    public static void main(String[] args) {
Mainboard mb = new Mainboard(); //实例化
        VideoCard vc = new VideoCard();  //这个不是抽象的数据吗，不能实例化
        vc.setName("huawei");
        SoundCard sc = new SoundCard();
        mb.interfacePCI(vc);
        mb.interfacePCI(sc);
        mb.run();
    }
}
