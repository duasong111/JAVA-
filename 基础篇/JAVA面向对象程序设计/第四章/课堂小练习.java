import java.util.Scanner;
//完成老师课堂上演示的案例
//这个相当于是一个小的练 习
abstract class Pet{ //采用抽象类哈
  abstract void feed();
  abstract  void use();

}
 class Dog extends Pet{
    void use(){
        System.out.println("小狗爱吃肉包子  汪汪汪！！！");
    }
    void feed(){
        System.out.println("给小狗喂食");
    }
}
class Cat extends Pet{
    void use(){
        System.out.println("我是小猫我爱抓老鼠");
    }
    void feed(){
        System.out.println("我爱吃猫粮");
    }
}
 class Person{ //创建人这个类
    String name;
   public Person(String names){
        this.name = names;
    }
    public void out111(){
       System.out.println(name+"开始喂食了");
    }
    public void feed(Pet pet){
        pet.feed();
    }
     public void use(Pet pet){
         pet.use();
     }

}
public class Main {
    public static void main(String[] args) {
      Pet pet;
      pet = new Dog();
      Person person = new Person("张三");
      person.out111(); //输出张三开始喂食了
      person.feed(pet); //小狗爱吃肉包子
      person.use(pet); //小狗看门
      System.out.println("---------------------------------");
      pet = new Cat(); //这个其实就是相当于你给他重新去赋予新的值
      person.feed(pet); //小猫吃东西
        person.use(pet);

    }
}

