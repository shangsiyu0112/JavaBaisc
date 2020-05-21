package compare;

import org.junit.Test;

import java.util.Arrays;

/**
 * @athor 尚思雨
 * @date 2020-05-21-21:54
 */
public class Comparable {
    /*
    java中的对象，正常情况下，只能比较==或！= 不能使用> 的，
    但是再开发场景中，我们需要对多个对象进行排序，就需要比较对象的大小
    我们就需要：使用两个接口中的任何一个Comparable和Comparetor
    1.重写CompareTo（obj）的规则：
        如果当前对象this大于形参对象obj，则返回正数
        如果当前对象this小于形参对象，返回负整数
        如果等于当前对象小于形参对象，返回0
     */
    @Test
    public void test01(){
       //Comparable的实现举例
       String[] strs = new String[]{"AA","BB","MM","DD","JJ","CC","EE"};
       Arrays.sort(strs);
       System.out.println(Arrays.toString(strs));//[AA, BB, CC, DD, EE, JJ, MM]
        //String为什么可以排序，是因为实现了Comparable接口
    }

    @Test
    public void test02(){
        //对于自定义类，如果需要排序，我们可以让自定义类实现Comparable接口
        Good[] goods = new Good[4];
        goods[0] = new Good("xiaomi",120);
        goods[1]= new Good("huawe",150);
        goods[2]= new Good("daier",160);
        goods[3]= new Good("haier",170);
        Arrays.sort(goods);//去按照Good类中的compareTo
      for (Good good : goods){
          System.out.println(good);
      }

    }

}
