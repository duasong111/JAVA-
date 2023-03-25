//多态的实例
import java.util.Scanner;
//多态性的使用,
//其实我感觉就是引用了第三方，这样可以少一点代码，通过第三方来进行输出
class Vehicle{
    void  start(){
        System.out.println("start！");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("小车以45Km/h的速度来上学");
    }
}
class Truck extends Vehicle{
    @Override
    void start() {
        System.out.println("小车以90Km/h的速度来赚钱");
    }
}
class Person{
    void order(Vehicle v){
        v.start();
    }
}
public class Main {


    public static void main(String[] args) {
        Person p = new Person(); //在此处开辟空间，为了一会调用他们
      
        //下边的这两种方法是一样的，反而第二种还进行简便一些呢
        Car c = new Car();  //先将Car来进行实例化 来进行开辟空间
        p.order(c);
        p.order(new Car()); //直接来开辟空间
        p.order(new Truck());
        
    }
}

