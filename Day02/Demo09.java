import java.util.Scanner;
public class Demo09{
    public static void main(String[] args){
        System.out.print("Enter a degree in Celsius:");
        //输入摄氏温度
        Scanner input = new Scanner(System.in);
        double sheShiDu = input.nextDouble();

        //将摄氏温度转换成华氏温度
        double huashi = (9.0/5)*sheShiDu+32;

        //输出温度
        System.out.println((int)sheShiDu+" Celsius is "+huashi+" Fahrenheit");
    }
}