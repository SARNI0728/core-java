package _2510;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/31 17:18
 * @Version 1.0
 */
public class Solution1 {
    public String addSpaces(String s, int[] spaces) {
        String[] ts = new String[spaces.length + 1]; //Tempo String存储空格间的单词
        for (int i = 0; i < ts.length; i++) {
            if(i == 0){
                ts[i] = s.substring(0,spaces[i]);
                continue;
            }

            if(i == ts.length - 1){
                ts[i] = s.substring(spaces[spaces.length-1],s.length());
                continue;
            }

            ts[i] = s.substring(spaces[i-1],spaces[i]);
        }
        StringBuilder ns = new StringBuilder();//New String 新的字符串
//        String ns = "";  以前的版本 这个版本每次执行都会创建一个新的String
        for (int i = 0; i < ts.length; i++) {
            ns.append(ts[i]);
            if(i != ts.length-1){
                ns.append(" ");
            }
        }
        return ns.toString();
    }
}
