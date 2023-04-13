import java.util.Scanner;
import java.util.*;

public class Main {
   public static void main(String[] args){
      try{
          int j = Integer.parseInt(args[0]);
          int i=100/j;
          System.out.println("i="+i);
      }catch (ArithmeticException e){
          System.out.println("除数j不等于0");
      }catch(NumberFormatException e){
          System.out.println("请输入一个整数：");
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("请对数组来进行赋值");
      }finally {
          System.out.println("不发生意外的话我会输出滴");
      }

      //这就是简单的异常处理
   }
}
