/**
读取一个0-1000整数并将各位数字相加
 */

import java.util.Scanner;
public class Demo11{
    public static void main(String[] args){
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //获得个位数
        int a = (num/1)%10;
        //获得十位数
        int b = (num/10)%10;
        //获得百位数
        int c = (num/100)%10;
        //各位数相加
        int sum = a+b+c;
        System.out.println("The sum of the digits is "+sum);
    }
}