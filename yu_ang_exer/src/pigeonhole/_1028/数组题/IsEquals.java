package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 17:57
 * @Version 1.0
 */
public class IsEquals {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1};
        equals(arr1,arr2);
    }
    private static void equals(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("不一样");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("不一样");
                return;
            }
        }
        System.out.println("一样");
    }
}
