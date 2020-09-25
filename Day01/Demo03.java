import java.util.Scanner;
import java.lang.Math;
public class Demo03{
    public static void main(String[] args){
        double c;    //元的周长
        double s;    //元的面积
        System.out.println("请输入元的半径")
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        c = 2*r*Math.PI;
        s = Math.pow(r,2.0)*Math.PI;
        System.out.println("元的面积s = "+s+"\n元的周长c = "+c);
    }
}