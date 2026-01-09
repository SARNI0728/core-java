package _interface.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/15 19:44
 * @Version 1.0
 */
public class Mouse implements USBDevice{
    public void connect(){
        System.out.println("鼠标连接中...");
    }
    public void disconnect(){
        System.out.println("鼠标已断开连接");
    }
}
