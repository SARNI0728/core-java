package pigeonhole._1028.数组题;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 17:20
 * @Version 1.0
 */
public class statCharacter {
    public static void main(String[] args) {
        char[] arr = {'a','l','f','m','f','o','b','b','s','n'};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;//统计数置1

            for (int j = i;j + 1 < arr.length; j++) {
                if(arr[j + 1] == arr[i]){
                    count++;
                    arr[j + 1] = 0; //找到一样的直接破坏性读出，省的后面再找到这个
                }
            }
            if(arr[i] != 0)
                System.out.println(arr[i] + "->" + count);
        }
    }
}
