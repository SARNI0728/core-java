package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 17:47
 * @Version 1.0
 */
public class Symmetry {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,2,1};
        isSym(arr);
        isSym(arr2);
    }
    private static void isSym(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int p = 0,q = arr.length - 1; //两个指针分别指向首和尾/如果是奇数
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[p++] != arr[q--]){
                System.out.println("不对称");
                return;
            }
        }
        System.out.println("对称");
    }

}
