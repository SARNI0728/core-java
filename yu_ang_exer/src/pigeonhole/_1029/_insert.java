package pigeonhole._1029;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/29 10:39
 * @Version 1.0
 */
public class _insert {
    private static void insertSort(int[] a){
        int temp;
        for (int sortedIndex = 1; sortedIndex < a.length; sortedIndex++) {
            int p = sortedIndex - 1;
            int j = sortedIndex;
            while(a[j] < a[p]){ //while的作用就是找到应该交换的位置
                temp = a[j];
                a[j] = a[p];
                a[p] = temp;
                j--;
                if(p == 0)
                    break;
                p--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 1, 8, 728, 721};
        insertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
