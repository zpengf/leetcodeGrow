package codeMain;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class StringRepeat {
    public static void main(String[] args) {


        String s = "pwwkew";
        int num = lengthOfLongestSubstring(s);
        System.out.println(num);

    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> curSet = new HashSet<>();
        int length = s.length();

        int left = 0;
        int right = -1;

        while (left < length){
            if(right + 1 < length && !curSet.contains(s.charAt(right + 1))){
                curSet.add(s.charAt(right + 1));
                right++;
            }else {
                curSet.remove(s.charAt(left));
                left++;
            }
            result = Math.max(result,right - left + 1);
        }


        return result;

    }
    public static int lengthOfLongestSubstring1(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();

        // 定义滑动窗口左右边界 右边界初始值为-1，表示刚开始窗口还不存在
        int left = 0;
        int right = -1;
        while (left < s.length()) {
            // 如果还有元素可考察，且当前考察元素在set中不存在
            // 同时将当前考察元素存入set，同时扩大窗口右边界
            if (right + 1 < s.length() && !set.contains(s.charAt(right+1))) {
                set.add(s.charAt(right+1));
                right++;
            }else {
                // 当前考察元素在set中有，则需要缩小窗口左边界
                // 在缩小左边界时，要将对应元素从set移除
                set.remove(s.charAt(left));
                left++;
            }

            // 计算子串最大长度
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
