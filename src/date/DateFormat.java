package date;

import org.junit.Test;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @athor 尚思雨
 * @date 2020-05-21-21:22
 */
public class DateFormat {
    @Test
    public void test(){
        //方式一：预定义的标准格式。如： ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:日期到字符串
        LocalDateTime dateTime = LocalDateTime.now();
        String dateFormat = format.format(dateTime);
        System.out.println(dateTime);//2020-05-21T21:26:57.056
        System.out.println(dateFormat);//2020-05-21T21:26:57.056
        //解析：字符串到日期
        TemporalAccessor time = format.parse("2020-05-21T21:26:57.056");
        System.out.println(time);
        //方式二：
        // 本地化相关的格式一如：ofLocalizedDateTime(FormatStyle.LONG)
        //FormatStyle.SHORT   20-5-21 下午9:33
        // FormatStyle.LONG  2020年5月21日 下午09时37分00秒
        // FormatStyle.MEDIUM  2020-5-21 21:37:25
        // 定义格式的常量
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //格式化
        String format1 = formatter.format(dateTime);
        System.out.println(format1);//20-5-21 下午9:33
        //本地化相关的格式二如：ofLocalizedDateFormatStyle.FULL)
        //FormatStyle.FULL  2020年5月21日 星期四
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String format2 = formatter1.format(dateTime);
        System.out.println(format2);//2020年5月21日 星期四

    }
    @Test
    public  void test02(){
        //（常用）方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        //格式化
        String format = formatter.format(dateTime);
        System.out.println(format);
        //解析
        TemporalAccessor parse = formatter.parse("2020-05-21 09:41:28");
        System.out.println(parse);

    }
}
