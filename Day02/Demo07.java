public class Demo07{
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
        System.out.println("当前秒数"+nowSeconds);
        System.out.println("当前分钟数"+nowMinutes);
        System.out.println("当前小时数"+nowHours);
    }
}