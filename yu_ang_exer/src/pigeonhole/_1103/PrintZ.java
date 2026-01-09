package pigeonhole._1103;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 9:11
 * @Version 1.0
 */
public class PrintZ {
    public static void main(String[] args) {
        final int Z_SIZE = 5;
        for (int i = 1; i <= Z_SIZE; i++) {
            for (int j = 1; j <= Z_SIZE; j++) {
                if(i > 1 && i < Z_SIZE){
                    if(j == Z_SIZE - i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
