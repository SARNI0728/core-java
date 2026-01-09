package november.eighteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Filter {
    private final List<String> dirtyWords;

    public Filter(List<String> dirtyWords) {
        this.dirtyWords = new ArrayList<>();
        if (dirtyWords != null) {
            this.dirtyWords.addAll(dirtyWords);
        }
    }

    public void addDirtyWord(String word) {
        if (word != null && !word.isEmpty()) {
            dirtyWords.add(word);
        }
    }

    /**
     * 过滤输入文本中的脏词，替换为相同长度的 '*'，支持多个出现且保留原文其他字符。
     * 匹配时使用不区分大小写的比较（通过小写副本进行匹配），对中文/多字词也适用。
     */
    public String filter(String message) {
        if (message == null || message.isEmpty() || dirtyWords.isEmpty()) {
            return message;
        }

        StringBuilder out = new StringBuilder(message);
        StringBuilder lower = new StringBuilder(message.toLowerCase());

        for (String word : dirtyWords) {
            if (word == null || word.isEmpty()) continue;
            String lw = word.toLowerCase();
            int idx = lower.indexOf(lw);
            while (idx != -1) {
                for (int i = 0; i < lw.length(); i++) {
                    out.setCharAt(idx + i, '*');
                    lower.setCharAt(idx + i, '*'); // 防止重复匹配同一位置
                }
                idx = lower.indexOf(lw, idx + lw.length());
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Filter filter = new Filter(Arrays.asList("煞笔", "低能儿", "王八操的"));
        System.out.println("输入想说的话...");
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String result = filter.filter(input);
            System.out.println("系统输出：\n" + result);
        }
    }
}
