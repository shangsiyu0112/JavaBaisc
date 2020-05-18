package basic;

/**
 * @athor 尚思雨
 * @date 2020-05-18-22:25
 */
/*
笔试题：
创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求 元素的值各不相同。
 */
public class TestArray {
    public static void main(String[] args) {
        int [] arr = new int[6];
        for(int i = 0;i<arr.length;i++){
            int v = (int)(Math.random() * 30) + 1;
            for(int j = 0; j<i;j++){
                if(arr[j]==v){
                    i--;
                }else{
                    arr[i]=v;
                }
            }

        }
//方式二：
        int[] arr2 = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
