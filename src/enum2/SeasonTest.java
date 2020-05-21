package enum2;

/**
 * @athor 尚思雨
 * @date 2020-05-21-23:03
 */
/*
枚举类说明
1.类的对象只有有限个，确定的。举例如下：
2.当需要定义一组常量时，强烈建议使用枚举类（枚举类有好几个对象，对象是常量）
3.若枚举只有一个对象, 则可以作为一种单例模式的实现方式。
枚举类的定义
  1.5.0之前,自定义枚举类
  2.5.0之后,使用enum关键字定义枚举类
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }

}
//自定义枚举类
class Season{
    //1.声明Seaon对象的属性,习惯属性私有,对象是常量,那么属性也是常量,final修饰
    private final String seasonName;
    private final String seasonDesc;
    //2.构造器私有化,因为每个常量对象都有各自的属性常量
    //常量赋值:显示赋值,构造器赋值(选择这个每个对象有自己的属性值),代码块赋值,
    private Season(String seasonName,String seasonDesc) {
        //给属性赋值
        this.seasonName = seasonName;
        this.seasonDesc =seasonDesc;
    }
    //3.提供当前枚举类的多个对象,外面不能创建对象,里面创建,使用类调用用static修饰
    public static final Season SPRING = new Season("春天","暖和");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTOMN = new Season("秋天","飒爽");
    public static final Season WINTER = new Season("冬天","冰冷");

    //4.其他诉求:获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //5.其他诉求:提供toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
