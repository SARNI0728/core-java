package november.fifth;

/**
 * Description:
 *      将一组double类型的数组四舍五入取小数点后两位数字
 * @Author SArNi
 * @Create 2025/11/5 20:27
 * @Version 1.0
 */
public class RoundOff {
    public static void main(String[] args) {
        double[] rawNums = {3.1415,5.6789,4.523,7.658};
        double[] workedNums = new double[rawNums.length];
        for (int i = 0; i < rawNums.length; i++) {
            workedNums[i] = (double)((int)((rawNums[i] + 0.005)*100))/100; //四舍五入并保留两位小数
        }
        for(double num : workedNums){
            System.out.println(num + "\t");
        }
    }
}
