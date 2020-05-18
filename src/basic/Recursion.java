package basic;

/**
 * @athor 尚思雨
 * @date 2020-05-19-1:19
 */
public class Recursion {
    public static void main(String[] args) {
        // 例1：计算1-100之间所有自然数的和
        // 方式一：
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 方式二：
        Recursion test = new Recursion();
        int sum1 = test.getSum(100);
        System.out.println(sum1);

        System.out.println("*****************");
        int value = test.f(10);
        System.out.println(value);

    }

    // 例1：计算1-n之间所有自然数的和
    public int getSum(int n) {// 3

        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }

    }

    // 例2：计算1-n之间所有自然数的乘积:n!
    public int getSum1(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }

    }

    //例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
    //其中n是大于0的整数，求f(10)的值。
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
//			return f(n + 2) - 2 * f(n + 1);
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}
