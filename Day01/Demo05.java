import java.util.Scanner;

public class Demo05{
    public static void main(String[] args){
        System.out.println("请输入花费的小时：");
        Scanner inpu = new Scanner(System.in);
        double hour = inpu.nextDouble();

        System.out.println("请输入花费的分钟：");
        Scanner input = new Scanner(System.in);
        double minute = input.nextDouble();

        System.out.println("请输入花费的秒：");
        Scanner in = new Scanner(System.in);
        double seconds = in.nextDouble();

        System.out.println("请输入跑了多少英里：");
        Scanner inp = new Scanner(System.in);
        double mile = inp.nextDouble();

        

        double hours = (minute*60+seconds)/3600+hour;
        double kilometer = mile*1.6;

        double v = mile/hours;

        System.out.println("速度为："+v+"公里/每小时");
    }
}