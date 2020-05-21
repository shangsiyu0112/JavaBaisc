package compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @athor 尚思雨
 * @date 2020-05-21-22:22
 */
public class Compartor {
    @Test
    public void test(){
        String[] strs = new String[]{"AA","BB","MM","DD","JJ","CC","EE"};
        //创建接口实现类的对象，我们只用一次，使用匿名对象创建
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //这里我们从小到大去排序
                return  -o1.compareTo(o2);

            }
        });
    }
    @Test
    public void test02(){
        //对于自定义类，如果需要排序，我们可以让自定义类实现Comparable接口
        Good[] goods = new Good[4];
        goods[0] = new Good("xiaomi",120);
        goods[1]= new Good("huawe",150);
        goods[2]= new Good("daier",160);
        goods[3]= new Good("haier",170);
        Arrays.sort(goods, new Comparator<Good>() {
            @Override
            public int compare(Good o1, Good o2) {
                if(o1.getName().equals(o2.getName())){
                    return o1.compareTo(o2);
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });//去按照Good类中的compareTo
        for (Good good : goods){
            System.out.println(good);
        }
    }
}