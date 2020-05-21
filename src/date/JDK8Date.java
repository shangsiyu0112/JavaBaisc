package date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @athor 尚思雨
 * @date 2020-05-21-20:58
 */
public class JDK8Date {

    /*
    LocalDateTime相较于前两个使用频繁，
     */
    @Test
    public void test01(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        //of()设置指定的年月日时分秒
        LocalDateTime.of(2020,12,10,10,35);
        //getXXX()
        dateTime.getDayOfMonth();
        dateTime.getDayOfWeek();
        dateTime.getDayOfYear();
        dateTime.getMinute();
        //with()设置,会返回一个新的时间对象，体现了日期不可变性
        LocalDateTime dateTime2 = dateTime.withDayOfMonth(14);//设置为当前月14号。之前的日期不会变化
        System.out.println(dateTime);
        System.out.println(dateTime2);
        //加几天
        LocalDateTime dateTime1 = dateTime.plusDays(2);//加了两天
        System.out.println(dateTime1);
        //减几天
        LocalDateTime dateTime3 = dateTime.minusDays(2);
        System.out.println(dateTime3);
    }
}
