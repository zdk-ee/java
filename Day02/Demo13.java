import java.util.Scanner;
public class Demo13{
    public static void main(String[] args){
        //输入水的质量
        System.out.print("Enter the amount of water in kilograms: ");
        Scanner input_k = new Scanner(System.in);
        float m = input_k.nextFloat();
        //输入水的初始温度
        System.out.print("Enter the initial temperature: ");
        float temperature_initial = input_k.nextFloat();
        //输入水的最终温度
        System.out.print("Enter the final temperature: ");
        float temperature_final = input_k.nextFloat();
        //计算能量
        float q = m*(temperature_final-temperature_initial)*4184; 
        //输出能量
        System.out.println("The energy needed is "+q);
    }
}