package MyPackage;

public class HelloWorld {

       public static void main(String[] args) {      

       double m=10,n=5,p,q; //定义两个double类型的变量，将变量m的初值赋值为10，变量n的初值赋值为5

m+=3;//变量m的值加3

n+=5;//变量n的值加5

p=(m+n)/2;//求m和n的平均值，并将结果存于变量p中

q=(m*m)*(n*n);//求m的平方乘以n的平方，并将结果存于变量q中

System.out.println("p的打印值是:"+p);

System.out.println("q的打印值是:"+q);       

}

}
