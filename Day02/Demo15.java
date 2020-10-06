import java.util.Scanner;
public class Demo15{
    public static void main(String[] args){
        //输入第一个点
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        //输入第二个点
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //计算两点之间的距离
        double distance = Math.pow(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2.0),0.5);
        //输出结果
        System.out.println("The distance between the two points is "+distance);
    }
}