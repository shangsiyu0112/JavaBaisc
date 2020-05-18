package basic;

import java.lang.reflect.Method;

/**
 * @athor 尚思雨
 * @date 2020-05-19-0:57
 */
public class Transfer {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);//需要在method方法调用之后，打印出a=100，b=200；填写method方法的代码。
        //这题根本不是考虑方法的传递，且方法传递无法做出来的
        //思路一：执行万method，就让JVM停止运行
        //思路二：换打印流，
        //总之：不让执行以下语句。
        System.out.println("b="+b);
        System.out.println("a="+a);
    }
    public static  void method(int a ,int b){
        a = a*10;
        b = b*20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);

    }

}
