package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 8:50
 * @Version 1.0
 */
public class PrintNarcissisticNumber {
    public static void main(String[] args) {
        int unit; //个位
        int decade; //十位
        int hundreds; //百位
        for (int i = 100; i < 1000; i++) {
            unit = i % 10;
            decade = i/10 %10;
            hundreds = i / 100;
            if(Math.pow(unit,3) + Math.pow(decade,3) + Math.pow(hundreds,3) == i){
                System.out.println(i);
            }
        }
    }
}
