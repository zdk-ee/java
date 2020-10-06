import java.util.Scanner;
public class Demo14{
    public static void main(String[] args){
        //输入存钱数
        System.out.print("Enter the monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        double save_money = input.nextFloat();
        //设置每月之后的总钱数
        double money_all = 0;
        //循环得到六个月之后的钱数
        for(int i=0;i<6;i++){
            money_all = (save_money+money_all)*(1+0.00417);
        }
        //输出总钱数
        System.out.println(String.format("After the sixth month, the account value is $%.2f",money_all));

    }
}