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
         Scanner input = new Scanner(System.in);
         double a = input.nextDouble();
         double b = input.nextDouble();
         double e = input.nextDouble();
         System.out.println("请输入第二个二元一次方程（如ax+by=c，只需输入a,b,c的值）：");
         double c = input.nextDouble();
         double d = input.nextDouble();
         double f = input.nextDouble();

         //计算
         double x = (e*d-b*f)/(a*d-b*c);
         double y = (a*f-e*c)/(a*d-b*c);

         System.out.println("方程组的解:\nx="+x+"\ny="+y);

     }
 }
