package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/3 22:06
 * @Version 1.0
 */
public class ChickenAndRabbitInACageProblem {
    public static void main(String[] args) {
        int HEAD_NUMBER = 50;
        int LEG_NUMBER = 120;

        int chickenNumber,RabbitNumber;

        for(chickenNumber = 0; chickenNumber <= HEAD_NUMBER;chickenNumber++){
            for (RabbitNumber = 0; RabbitNumber <= HEAD_NUMBER; RabbitNumber++) {
                if(4*RabbitNumber + 2*chickenNumber == LEG_NUMBER && RabbitNumber + chickenNumber == 50){
                    System.out.println("鸡的数量为：" + chickenNumber + ", 兔的数量为:" + RabbitNumber);
                    break;
                }
            }

        }
    }
}
