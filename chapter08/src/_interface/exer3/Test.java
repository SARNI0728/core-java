package _interface.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/15 19:47
 * @Version 1.0
 */

public class Test {
    public static void useDevice(USBDevice device) {
        device.connect();
        device.disconnect();
    }

    public static void main(String[] args) {
        useDevice(new Mouse());
        useDevice(new Keyboard());
    }
}
