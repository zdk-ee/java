import java.util.Scanner;
public class Demo12{
    public static void main(String[] args){
        //获得总的毫秒数
        long totalMilliseconds = System.currentTimeMillis();
        
        //获得总的秒数
        long totalSeconds = totalMilliseconds/1000;
        //获得当前秒数
        long nowSeconds = totalSeconds%60;


        //获得总分钟数
        long totalMinutes = totalSeconds/60;
        //获得当前分钟数
        long nowMinutes = totalMinutes%60;

        //获得总小时数
        long totalHours = totalMinutes/60;
        //获得当前小时数
        long nowHours = totalHours%24;

        //输入偏移量
        System.out.print("Enter the time zone offset to CMT: ");
        Scanner input = new Scanner(System.in);
        int cmt = input.nextInt();
        nowHours = nowHours+cmt;
        System.out.println("The current time is "+nowHours+":"+nowMinutes+":"+nowSeconds);
    }
}