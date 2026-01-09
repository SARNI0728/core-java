package com.SArNi.pigeonhole;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/8 8:01
 * @Version 1.0
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[3];
        for (int i = 0; i < rect.length; i++) {
            rect[i] = new Rectangle();
            rect[i].len = (i+1)*10;
            rect[i].width = (i+1)*5;
            rect[i].detail();
        }
    }
}
