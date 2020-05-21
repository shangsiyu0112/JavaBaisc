package date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @athor 尚思雨
 * @date 2020-05-21-13:05
 */
public class testDate {

    @Test
    public void test01(){
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);//1590037800639
        Date date1 = new Date(1590037800639L);
        System.out.println(date1);
        //如何将java.util.Date对象转换为java.sql.Date对象(父类到子类的转换)
        //情况一：父类引用指向子类对象，强转就可以
        Date date2 = new java.sql.Date(1590037800639L);
        java.sql.Date date3 =  (java.sql.Date)date2;
        //情况二：util下的Date塞到数据库中，数据库的date与sql下的Date搭配的
        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
    }
    @Test
    public void test02() throws ParseException {
        //格式化
        Date date6 = new Date();
        System.out.println(date6);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(date6);
        System.out.println(format);
        //解析,但是格式必须是20-5-21 下午4:08
        String date = "20-5-21 下午4:08";
        Date date2 = dateFormat2.parse(date);
        System.out.println(date2);
    }
}
