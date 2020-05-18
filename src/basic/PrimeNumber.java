package basic;

/**
 * @athor 尚思雨
 * @date 2020-05-18-19:59
 */
/*
100000以内的所有质数的输出。实现方式一
质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。

对PrimeNumberTest.java文件中质数输出问题的优化
未加break的时间：花费了时间23934；对于非质数有效
加上break的时间：花费了时间2772；
加上break和根号：花费了时间196；对本身是质数的有效
*/
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值
        // (这也可以将标识符放到第一个循环体里，但是每次都要创建一个变量，浪费了空间)
        //也就是如果考虑把偶数踢出来，那么时间复杂度n变为二分之n，这样时间并没有减多少。
        long startTime = System.currentTimeMillis();//获取当前时间距离1970年1月1日的00：00的毫秒数
        for(int i = 2;i <= 100000;i++){//遍历100以内的自然数


            for(int j = 2;j < Math.sqrt(i);j++){//j:被i去除

                if(i % j == 0){ //i被j除尽
                    isFlag = false;
                   break;//优化方式1：如果i不是一个质数，那么优化有效了。
                }

            }
            //
            if(isFlag == true){
                count++;//花费了时间31
                // System.out.println(i);拖慢了我们的时间，我们只需记录质数的个数
                //花费了时间196；
            }
            //重置isFlag
            isFlag = true;

        }
        System.out.println(count);
        long endTime = System.currentTimeMillis();
        System.out.println("花费了时间"+(endTime-startTime));
    }
}

