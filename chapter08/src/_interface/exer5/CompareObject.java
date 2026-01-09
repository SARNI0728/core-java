package _interface.exer5;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/15 20:11
 * @Version 1.0
 */
public interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}
