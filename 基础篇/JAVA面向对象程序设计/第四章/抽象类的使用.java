//例题5.2
import java.util.Scanner;
//抽象类的使用-----据说只是多加了一个抽象类,同时具有类的所有的功能
//其实说到抽象的数据类型，我感觉最大的东西就是说，他可以去定义功能，但是需要自己的子类实现
abstract class Animal{
    String name;
    public abstract  void go(); //抽象的类是没有方法体的
    //这个时候设置子类如果没有实现的他的功能是要加前缀名abstract的
}
class Dog extends Animal{
    public Dog(String name){
        this.name = name; //这个改变的是那个父亲也就是Animal
    }
    public void go(){
        System.out.println(name+"can run");
     }
}
class Bird extends Animal{
    public Bird(String name){
        this.name = "李四"; //这个改变的是那个父亲也就是Animal
    }
    public void go(){
        System.out.println(name+"can run");
    }
}
class show{
    void show1(Animal x){
        x.go();
    }
    public void out111(){
        System.out.println("这个是调用第三方去将其全部的输出");
    }
}
public class Main {

    //问题？ 为啥说在抽象类中，如果将他的子类也设置抽象类不行吗？
    //行，但是抽象类就是相当于提供了功能，但是实践需要子类去完成，如果子类继续抽象
    //那就是子类的子类来完成，因为抽象类是不能实例化的，就是不能在main中定义
    //这就是为啥这里不能用 final 和static的 原因
    public static void main(String[] args) {
//        Dog dog = new Dog("张三");
//        dog.go();
        show w = new show();
        Dog dog = new Dog("张三");
        Bird bird = new Bird(""); //我不传入任何的值因为我前边已经定义好了
        w.show1(bird);
        w.show1(dog);
        w.out111();

    }
}
