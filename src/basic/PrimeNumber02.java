package basic;

/**
 * @athor 尚思雨
 * @date 2020-05-18-20:53
 */
public class PrimeNumber02 {
    public static void main(String[] args) {
        int count =0;

       out: for(int i = 0;i<=100000;i++){
            for(int j = 2;j < Math.sqrt(i) ;j++){
                if(i % j  ==0){
                    continue out;
                }

            } count++;
        }
        System.out.println(count);
    }

}
