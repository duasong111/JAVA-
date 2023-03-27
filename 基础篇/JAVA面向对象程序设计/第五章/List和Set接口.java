import java.util.Scanner;
import java.util.*;
//利用Collection中的List接口
public class Main {
    public static void main(String[] args) {
      List list = new ArrayList<String>();  //创建了一个List的集合
       list.add("你好");
       list.add("今天天气是晴天");
       list.add("我饿了");
       list.remove("我饿了啊");
       list.set(2,"我不是很饿"); //这个相当于动态数组一样的是从0开始的，此处才用的是替换
       // System.out.println(list.get(1));  //直接获取到第一个的元素值
        list.add(2,"我是最帅的"); //将其插入到第二个元素的位置
       Iterator<String> it = list.iterator();
       //对于set和list的差距其实不是特别大，就是有一个不能重的功能
//       Set set = new HashSet<String>();
//       set.addAll(list);
//       Iterator<String> it =set.iterator();//创建set集合的迭代器
//        System.out.println("集合中的元素是:");
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}




