package _2510;

import org.junit.Test;

import java.util.HashMap;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/31 22:01
 * @Version 1.0
 */
public class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>(); //用于记录不同字符串出现的次数
        int[] freq = new int[26];//用于寻找出现了几次不同的字母
        int letterCount = 0; //用于记录子串的字母数量
        for(int right = 0,left = 0;right < s.length();right++){
            int index = s.charAt(right) - 97;
            freq[index]++;
            if(freq[index] == 1)
                letterCount++; //不同字符数++

            if(right - left + 1 > minSize){
                index = s.charAt(left++) - 97;
                freq[index]--;
                if(freq[index] == 0)
                    letterCount--;
            }

            if(right - left + 1 == minSize && letterCount <= maxLetters){
                map.put(s.substring(left,right+1), map.getOrDefault(s.substring(left,right + 1), 0)+1);
            }
        }


        int maxNum = 0;
        for (Integer k : map.values()) {
            if (k > maxNum)
                maxNum = k;
        }
        return maxNum;
    }
    @Test
    public void Test1(){
        System.out.println(maxFreq("daaaac", 1, 4, 13));
    }
}


