package _interface.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/15 19:47
 * @Version 1.0
 */
public class Keyboard implements USBDevice{
    public void connect(){
        System.out.println("键盘连接中...");
    }
    public void disconnect(){
        System.out.println("键盘已断开连接");
    }
}
