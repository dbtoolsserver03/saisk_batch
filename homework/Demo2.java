import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //输入 随机起始时间
        String str = "2022-05-10";
        //解析时间
        Date d1 = sdf.parse(str);
        long before = d1.getTime();
        //获取当前时间
        Date d2 = new Date();
        long after = d2.getTime();
        
        long randomDate = randomLong(before,after);
        System.out.println(sdf.format(randomDate));
    }
    public static long randomLong(long start, long end){
        Random r = new Random();
        return (long) (start + (r.nextFloat() * (end - start + 1)));
    }
}
