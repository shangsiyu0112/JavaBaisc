package string;

import org.junit.Test;

/**
 * @athor 尚思雨
 * @date 2020-05-21-14:11
 */
/*
2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
方式一：转为char[] 数组，
方式二：使用string的拼接操作，
方式三：推荐 （相较于方式二做的改进）
 */
public class StringDemo {

    @Test
    public void testReverse(){
        String str =  "abcdef";
        String reverse = reverse(str, 1, 2);
        System.out.println(reverse);
    }

    public String reverse(String str,int startIndex,int endIndex){
        if(str!=null ){
            char[] chars = str.toCharArray();
            char temp ;
            while(startIndex < endIndex){
                char a = chars[startIndex];
                char b = chars[endIndex];

                System.out.println(a);
                System.out.println(b);
                temp = a;
                chars[startIndex] =b;
                chars[endIndex] =temp;
                startIndex++;
                endIndex--;
            }
            return new String(chars);
        }return null;
    }
    //方式二：基于string的拼接操作
    public String reverse02(String str , int startIndex,int endIndex){
        // 1.
        String newStr = str.substring(0, startIndex);// ab
        // 2.
        for (int i = endIndex; i >= startIndex; i--) {
            newStr += str.charAt(i);
        } // abfedc
        // 3.
        newStr += str.substring(endIndex + 1);
        return newStr;
    }
    //方式三
    public String reverse3(String str, int start, int end) {// ArrayList list = new ArrayList(80);
        // 1.
        StringBuffer s = new StringBuffer(str.length());
        // 2.
        s.append(str.substring(0, start));// ab
        // 3.
        for (int i = end; i >= start; i--) {
            s.append(str.charAt(i));
        }

        // 4.
        s.append(str.substring(end + 1));

        // 5.
        return s.toString();

    }
}
