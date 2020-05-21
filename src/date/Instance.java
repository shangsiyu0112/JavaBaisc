package date;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @athor 尚思雨
 * @date 2020-05-21-21:14
 */
public class Instance {
    @Test
    public void test01(){
        Instant now = Instant.now();
        //2020-05-21T13:15:11.870Z 本初子午线的时间，我们是东八区，比那边早了8小时
        System.out.println(now);
       //偏移8小时
        OffsetDateTime dateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(dateTime);//2020-05-21T21:17:28.496+08:00

        //获取对应的毫秒数，类似于date的gettime
        //概念上讲，它只是简单的表示自1970年1月1日0时0分0秒（UTC）开始的秒 数。
        long milli = now.toEpochMilli();
        System.out.println(milli);

        //Instant根据给定的毫秒数获取Instance实例
        Instant instant = Instant.ofEpochMilli(milli);
        System.out.println(instant);
    }
}
