//方法的重载
import java.util.Scanner;
//方法的重载
class Vehicle{
    int seats;
    Vehicle(){   //输出1
        seats = 4;
        System.out.println(seats);
    }
    Vehicle(int seats){ //重载的构造方法  
        System.out.println(seats);
    }
   void setSeats(){  //没有参数的方法  输出3
        seats=6;
       System.out.println(seats);
    }
    void setSeats(int seats){  //有参数的方法
        this.seats=seats;
        System.out.println(seats);
    }
}
public class Main {
    public static void main(String[] args) {
       Vehicle Car = new Vehicle(); //开辟类的空间
        Vehicle Bus = new Vehicle(5);
        Car.setSeats();
        Car.setSeats(7);

    }
}

