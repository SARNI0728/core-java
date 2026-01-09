package december.xiii.guessnum;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        //第一步创建套接字
        ServerSocket serverSocket = new ServerSocket(7218);
        System.out.println("等待连接···");

        //第二步等待连接
        Socket socket = serverSocket.accept(); //accept是个阻塞方法，程序会一直卡在这等待连接
        InetAddress inetAddress = socket.getInetAddress(); //在有连接以后，获取客户端的ip地址对应的对象
        System.out.println(inetAddress.getHostAddress() + "连接成功！");

        //第三步在连接成功以后 开始进行传输数据等操作
        Random random = new Random();
        OutputStream out = socket.getOutputStream(); //给客户端的输出流
        PrintStream ps = new PrintStream(out,true); //获取客户端的控制台打印流,true代表自动换行

        int truthNumber = random.nextInt(10);
        ps.println("开始猜数游戏，现在数已生成，请输入数字。 （提示：0到9的一个数字）");

        InputStream input = socket.getInputStream(); //获取客户端的输入
        byte userProvidedNumber = (byte) input.read();

        while (truthNumber != userProvidedNumber) {
            if(userProvidedNumber > truthNumber)
                ps.println("当前你的输入是：" +  userProvidedNumber + "，猜错了。" + "你要猜的数字比你输入的数字要小。");
            else
                ps.println("当前你的输入是：" +  userProvidedNumber + "，猜错了。" + "你要猜的数字比你输入的数字要大。");

            userProvidedNumber = (byte) (input.read()); //重新接受客户端的输入
        }
        ps.println("恭喜你，猜对了！");

        //第四步 关闭流
        socket.close(); //关闭客户端
        socket.close(); // 关闭服务器端
    }

}
