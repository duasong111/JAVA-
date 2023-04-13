import java.util.Scanner;
import java.util.*;
public class Main {
    public static void test(int i) throws Exception{
      //  try{ //还可以就是在类中抛出一个异常，但是在main中去进行捕获该异常，但是要在类名中备注
          int []j = {4,7};
           if(i>=j.length)
               throw new Exception("数组下标越界了"); //其实这点是蛮有趣的---会提示手动抛出异常
           else                                      //就是throw只是抛出，但是却没有自行执行
            System.out.println("正常运行");
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
        //这就是简单的异常处理
    }
   public static void main(String[] args){
      try {
          test(3);
      }catch (Exception e){
          System.out.println(e.toString());
      }
      }
   }
//其实怎么说就是和那个抽象类蛮像的，就是不能有自己的方法体，而对于这个throw则是使用一个catch语句来进行对其处理上边是具有两种方式的
