import java.net.InetAddress;
import java.net.UnknownHostException;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        try {
            InetAddress host = InetAddress.getLocalHost();
            System.out.println(host);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}