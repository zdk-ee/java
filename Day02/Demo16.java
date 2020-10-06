import java.util.Scanner;
public class Demo16{
    public static void main(String[] args){
        //输入三角形的三个点坐标
        System.out.print("Enter three points for a triangle: ");
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //计算三角形三边长
        double l_1 = Math.pow(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2.0),0.5);
        double l_2 = Math.pow(Math.pow(x2-x3,2.0)+Math.pow(y2-y3,2.0),0.5);
        double l_3 = Math.pow(Math.pow(x3-x1,2.0)+Math.pow(y3-y1,2.0),0.5);
        //计算面积
        double s = (l_1+l_2+l_3)/2;
        double area = Math.pow(s*(s-l_1)*(s-l_2)*(s-l_3),0.5);
        //输出面积
        System.out.println(String.format("The area of the triangle is %.1f",area));

    }
}