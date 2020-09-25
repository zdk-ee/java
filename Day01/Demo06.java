/**
求解二元一次方程：

ax+by=e
cx+dy=f

x=(ed-bf)/(ad-bc)
y=(af-ec)/(ad-bc)
 */

 import java.util.Scanner;

 public class Demo06{
     public static void main(String[] args){

         //输入方程
         System.out.println("请输入第一个二元一次方程（如ax+by=c，只需输入a,b,c的值）：");
         Scanner inputa = new Scanner(System.in);
         double a = inputa.nextDouble();
         Scanner inputb = new Scanner(System.in);
         double b = inputb.nextDouble();
         Scanner inpute = new Scanner(System.in);
         double e = inpute.nextDouble();
         System.out.println("请输入第二个二元一次方程（如ax+by=c，只需输入a,b,c的值）：");
         Scanner inputc = new Scanner(System.in);
         double c = inputc.nextDouble();
         Scanner inputd = new Scanner(System.in);
         double d = inputd.nextDouble();
         Scanner inputf = new Scanner(System.in);
         double f = inputf.nextDouble();

         //计算
         double x = (e*d-b*f)/(a*d-b*c);
         double y = (a*f-e*c)/(a*d-b*c);

         System.out.println("方程组的解:\nx="+x+"\ny="+y);

     }
 }