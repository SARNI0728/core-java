package november.fifth;

/**
 * Description:
 *          给定一个值，在已经存在的数组中寻找是否存在这个值
 * @Author SArNi
 * @Create 2025/11/5 20:48
 * @Version 1.0
 */
public class IsExist {
    public static void main(String[] args) {
        int[] arr = {12,23,31,56,43,67};
        System.out.println(method(arr,99));
    }
    public static boolean method(int[] arr,int num){
        for(int i : arr){
            if(num == i){
                return true;
            }
        }
        return false;
    }
}
