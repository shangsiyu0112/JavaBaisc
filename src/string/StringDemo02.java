package string;

import org.junit.Test;

import javax.sound.midi.Soundbank;

/**
 * @athor 尚思雨
 * @date 2020-05-21-14:29
 */
/*
.获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”
      中出现的次数


 */
public class StringDemo02 {
    @Test
    public void testGetCount(){
        String str = "cdabkkcadkabkebfkabkskab";
        String str2 = "ab";
        int count = getCount(str, str2);
        System.out.println(count);
    }
    public int getCount(String mainStr, String subStr){
        int subLength = subStr.length();
        int mainLength = mainStr.length();
        System.out.println(mainLength);
        System.out.println(subLength);
        if(mainLength>= subLength){
            int count = 0;
            int index =0;
            //方式一
//           while((index = mainStr.indexOf(subStr))!= -1){
//                    count++;
//                    mainStr = mainStr.substring(index+subLength);
//            }
            //方式二
            while((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }
            return count;
        }else{
            return 0;
        }

    }
}
