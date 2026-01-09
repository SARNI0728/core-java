package december.xiii.guessnum;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1、准备Socket，连接服务器，需要指定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 7218);

        //2. 在连接成功以后，获取服务器的输出
        InputStream input = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        String line = br.readLine();
        System.out.println(line);


        //3.获取输出流，用来发送数据给服务器
        OutputStream out = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);//用户输入数字
        // 不断发送数据
        while (!line.equals("恭喜你，猜对了！")) {
            out.write(sc.nextInt());
            line = br.readLine();
            //会在流末尾写入一个“流的末尾”标记，对方才能读到-1，否则对方的读取方法会一直阻塞
            System.out.println(line);
        }

        //4、关闭socket，不再与服务器通信，即断开与服务器的连接
        //socket关闭，意味着InputStream和OutputStream也关闭了
        socket.close();
    }
}
