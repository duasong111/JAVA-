import java.util.Scanner;
import java.util.*;
//使用Map接口
class Book{
    //Interger：整数
    HashMap<Integer,String> map = new HashMap<Integer, String>();
    public Book(){
        map.put(167,"张三");
        map.put(168,"麻溜");
        map.put(169,"王五");
        map.put(170,"李四");
        System.out.println(getName(167));
        //从这一段就能看出其实你可以在getName中输入键则会得到值

    }
    public String getName(int amount){
        if(map.containsKey(amount)){
            return map.get(amount);
        }else
            return "No Find";
    }

}
public class Main {
    public static void main(String[] args) {
      Book books = new Book(); //实例化
      Scanner in = new Scanner(System.in); //手动输入查找的数字
        System.out.println(books.getName(in.nextInt()));//输出

    }
}




