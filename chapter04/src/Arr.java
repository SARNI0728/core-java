/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/6 19:49
 * @Version 1.0
 */

public class Arr {
    public static void main(String[] args) {
        String[] ctg;
        char[] point;
        ctg = new String[]{"黑桃","梅花","红心","方片"};
        point = new char[]{'A','2','3','4','5','6','7','8','9','X','J','Q','K'};

        for(int i = 0;i<ctg.length;i++){
            for (int j = 0; j<point.length;j++){
                System.out.print(ctg[i] + point[j] + "\t");
            }
            System.out.println();
        }
    }
}
