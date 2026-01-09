package november.twelve;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/12 19:49
 * @Version 1.0
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println(Method(32));
        System.out.println(Method(-274));
    }
    public static double Method(double celsiusDegree){
        if(celsiusDegree < -273.15 || celsiusDegree > 1.4 * Math.pow(10,32)){
            //当输入的温度小于绝对零度或者是大于普朗克温度时 抛出异常
            try {
                throw  new Exception("当前温度不正确");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return celsiusDegree * 1.8 + 32;
    }
}
