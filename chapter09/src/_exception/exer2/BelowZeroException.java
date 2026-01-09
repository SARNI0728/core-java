package _exception.exer2;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/25 11:31
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    BelowZeroException(){
        super();
    }
    BelowZeroException(String message){
        super(message);
    }
}
