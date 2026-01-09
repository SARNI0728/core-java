package pigeonhole._1029;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 9:58
 * @Version 1.0
 */
public class _bubble {
    private static void bubble(int[] arr) {
        int temp;
        int swapCount;// 记录交换次数 若交换次数为0则直接跳出
        for (int i = 0; i < arr.length; i++) {
            swapCount = 0;
            for (int p = 0 ,q = 1; q < arr.length - i;p++,q++) {
                if (arr[p] > arr[q]) {
                    temp = arr[q]; //临时变量
                    arr[q] = arr[p];
                    arr[p] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0) //如果一次也没交换 说明已经有序
                break;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 8, 728, 721};
        bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
