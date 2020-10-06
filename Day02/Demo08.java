import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        
        System.out.println("请输入总钱数:");
        Scanner input = new Scanner(System.in);

        double money = input.nextDouble();
        //总1分数
        int pennyAllSum = (int)(money/0.01);

        //总1美元数
        int dollarSum = pennyAllSum/100;
        int pennySum = pennyAllSum%100;

        //总2角5分数
        int quarterSum = pennySum/25;
        int pennySum1 = pennySum%25;

        //总1角数
        int dimeSum = pennySum1/10;
        int pennySum2 = pennySum1%10;

        //总5分数
        int nickel = pennySum2/5;
        //总1分数
        int pennySum3 = pennySum2%5;

        System.out.println(dollarSum+"个1美元");
        System.out.println(quarterSum+"个2角5分");
        System.out.println(dimeSum+"个1角");
        System.out.println(nickel+"个5分");
        System.out.println(pennySum3+"个1分");

    }
}