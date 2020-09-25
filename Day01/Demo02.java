import java.util.Scanner;
class Demo02{
    public static void main(String[] args){
        double p = 0;
        System.out.println("请输入分母上的最后一个数字：");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = 1;
        for(int i = 1;i<=m;i = i+2){
            p = p+1.0/i*n;
            n = -n;
        }
        System.out.println("p = "+p);
    }
}