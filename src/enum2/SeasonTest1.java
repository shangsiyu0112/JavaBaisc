package enum2;

/**
 * @athor 尚思雨
 * @date 2020-05-21-23:27
 */
/*
使用enum定义枚举类
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
    }
}
enum Season1{
    //1.提供当前枚举类的对象,多个对象之间用,隔开,末尾对象用;结束
    SPRING ("春天","暖和"),
    SUMMER ("夏天","炎热"),
    AUTOMN ("秋天","飒爽"),
    WINTER ("冬天","冰冷");
    //2.声明Season对象的属性Lprivate final修饰
    private final String seasonName;
    private final String seasonDesc;
  //3.提供私有的构造器方法
    private Season1(String seasonName,String seasonDesc) {
        //给属性赋值
        this.seasonName = seasonName;
        this.seasonDesc =seasonDesc;
    }
    //一般时候toString诉求可以不写,已经重写了,打印的时候枚举对象的名字
}

