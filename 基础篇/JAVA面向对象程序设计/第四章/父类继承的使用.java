//继承关系。调用父类
import java.util.Scanner;
class Vehicle{
    void  start(){
        System.out.println("start！");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        super.start();
    }
}
public class Main {


    public static void main(String[] args) {
        Car c = new Car();
        c.start();

    }
}
