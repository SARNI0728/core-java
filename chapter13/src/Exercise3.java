/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/5 14:06
 * @Version 1.0
 */
public class Exercise3 {
    public static <E> void method1( E[] e,int a,int b){
        E tempE = e[a];
        e[a] = e[b];
        e[b] = tempE;
    }

    public static void main(String[] args) {
        String[] strings= {"LYN","LSX","GZL","ZHZ"};
        for(String str : strings)
            System.out.println(str);
        method1(strings,2,3);
        for(String str : strings)
            System.out.println(str);
    }

}
