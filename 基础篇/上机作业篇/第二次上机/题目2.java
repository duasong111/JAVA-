import java.util.Scanner;
 class Car{ //汽车类
    String brand,model,color;
    int seat,price,sale, sum;
}
public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
       Car[] part = new Car[3]; // 定义数组
        for(int i=0;i<3;i++) //循环三次
            part[i]= new Car();

        for(int i=0;i<3;i++) { //采用循环结构，已经定义好的加上自定义输入
            System.out.println("请输入第"+(i+1)+"种车的信息");
            System.out.println("品牌:");
            part[i].brand=in.next();
            System.out.println("型号:");
            part[i].model=in.next();
            System.out.println("颜色:");
           part[i].color=in.next();
            System.out.println("座位数:");
            part[i].seat=in.nextInt();
            System.out.println("单价:");
            part[i].price=in.nextInt();
            System.out.println("上月销量:");
            part[i].sum=in.nextInt();
        }
        int account=0,sum_money=0;
        for(int i=0;i<3;i++) { //在这个循环中来记录总钱数和数量，其实就是看数组第四个，第五个
            sum_money=sum_money+part[i].sum;
            account=account+part[i].price*part[i].sum;
        }
        System.out.println("                        上月销量状况                                                                        ");
        System.out.println("      品牌     型号     颜色     座位数       单价        月销量       月金额                         ");
        System.out.println("-----------------------------------------------------------");
        for(int i=0;i<3;i++) {
            System.out.println(part[i].brand+"  "+part[i].model+"   "+part[i].color+"   "+
                    part[i].seat+"   "+part[i].price+"   "+part[i].sum+"   "+part[i].price*part[i].sum);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("上月销售量："+sum_money+"总销售金额："+account);
      //  System.out.println("总销售量："+sum_sum,);
    }
}




