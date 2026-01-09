package _exception.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/25 10:51
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    NoLifeValueException(){

    }
    NoLifeValueException(String message){
        super(message);
    }
}
