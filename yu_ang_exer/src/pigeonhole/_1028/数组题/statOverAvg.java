package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 17:40
 * @Version 1.0
 */
public class statOverAvg {
    public static void main(String[] args) {
        int[] scores = {95,92,75,56,98,71,80,58,91,91};
        double avg = getAvg(scores);
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= avg)
                count++;
        }

        System.out.println("高于平均分：" + avg +"的有：" + count + "个");
    }

    private static double getAvg(int[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum/scores.length;
    }
}


