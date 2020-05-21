package string;

import org.junit.Test;

import java.util.Arrays;

/**
 * @athor 尚思雨
 * @date 2020-05-21-14:52
 */
/*
		d. 获取两个字符串中最大相同子串。
		比如： str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
		提示：将短的那个串进行长度依次递减的子串与较长的串比较。

 */
public class StringDemo03 {

    public String getMaxSubStr(String str1,String str2){
        return null;
    }
    // 第4题
    // 如果只存在一个最大长度的相同子串
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() > str2.length()) ? str1 : str2;
            String minStr = (str1.length() > str2.length()) ? str2 : str1;

            int len = minStr.length();

            for (int i = 0; i < len; i++) {// 0 1 2 3 4 此层循环决定要去几个字符

                for (int x = 0, y = len - i; y <= len; x++, y++) {

                    if (maxStr.contains(minStr.substring(x, y))) {

                        return minStr.substring(x, y);
                    }

                }

            }
        }
        return null;
    }

    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
    public String[] getMaxSameSubString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }
    // 如果存在多个长度相同的最大相同子串：使用ArrayList
//	public List<String> getMaxSameSubString1(String str1, String str2) {
//		if (str1 != null && str2 != null) {
//			List<String> list = new ArrayList<String>();
//			String maxString = (str1.length() > str2.length()) ? str1 : str2;
//			String minString = (str1.length() > str2.length()) ? str2 : str1;
//
//			int len = minString.length();
//			for (int i = 0; i < len; i++) {
//				for (int x = 0, y = len - i; y <= len; x++, y++) {
//					String subString = minString.substring(x, y);
//					if (maxString.contains(subString)) {
//						list.add(subString);
//					}
//				}
//				if (list.size() != 0) {
//					break;
//				}
//			}
//			return list;
//		}
//
//		return null;
//	}

    @Test
    public void testGetMaxSameSubString() {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnmiodef";
        String[] strs = getMaxSameSubString1(str1, str2);
        System.out.println(Arrays.toString(strs));
    }


}
