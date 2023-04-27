import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //进行读入
//        InputStream input= System.in;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入:");
        String s=in.nextLine();
        File f=new File("C:testBook.txt");
        try{
            OutputStream out=new FileOutputStream(f); //读取文件按
            out.write(s.getBytes()); //将文件进行写入磁盘
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //文件进行输出
        try{
            InputStream out=new FileInputStream(f);
            int len=-1;
            byte[] bytes=new byte[1024];
            System.out.println("文件输出:");
            while((len=out.read(bytes))!=-1){//判断是否还有
                System.out.print(new String(bytes,0,len));
                //从0 开始 到整个字符串的长度结束
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
