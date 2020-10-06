/**
计算体积
 */
import java.util.Scanner;
public class Demo10{
    public static void main(String[] args){
        System.out.print("Enter the radius and length of a cylinder:");
        Scanner input_r=new Scanner(System.in);
        float r = input_r.nextFloat();
        float h = input_r.nextFloat();
        float s = (float)(Math.PI)*r*r;
        float v = s*h;
        System.out.println(String.format("The area is %.4f",s));
        System.out.println(String.format("The volume is %.1f",v));
    }
}