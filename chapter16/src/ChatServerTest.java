import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerTest {
    static ArrayList<Socket> users = new ArrayList<>(); //已经连接的用户列表

    //main函数的作用就是不断地检查是否有新用户连接
    public static void main(String[] args) throws IOException { //这里之所以在main函数抛出异常是想让这里的框架看的更清晰
        ServerSocket serverSocket = new ServerSocket(7218); //创建一个服务器套接字，服务器套接字仅需端口号而不需要ip地址。
        while (true) { //轮训等待是否有新用户想连接服务器
            Socket socket = serverSocket.accept(); //accept方法会阻塞在这里等待用户连接。
            users.add(socket);

            ChatServerHandler chatServerHandler = new ChatServerHandler(socket); //当有新用户连接以后，为这个用户创建一个新线程
            chatServerHandler.start();//线程启动
        }
    }

    static class ChatServerHandler extends Thread {
        private Socket socket;
        private String ip;

        ChatServerHandler(Socket socket) {
            super();
            this.socket = socket;
        }

        @Override
        public void run() {
            try{
                ip = socket.getInetAddress().getHostAddress();
                broadcast("用户" + ip + "上线了");
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in); //将字节流转换为字符流
                BufferedReader br = new BufferedReader(isr); //给字符流加上缓冲器

                String msg = null;
                while((msg = br.readLine()) != null){
                    //当用户没有输入信息时，服务器端对应这个用户的线程就会卡在这里
                    // 然若用户输入bye时，用户那边会返回一个null过来，跳出循环，这个线程终止。
                    broadcast(msg);
                }

                broadcast("用户" + ip + "下线了");
            }catch (Exception e){
                System.out.println("用户" + ip + "掉线了");
                e.printStackTrace();
            }finally {
                users.remove(socket);
            }
        }

        public void broadcast(String msg) throws IOException {
            //将msg打印到所有用户的屏幕上
            for (Socket onlineUser : users) { //遍历所有用户
                OutputStream os = onlineUser.getOutputStream(); //然后得到各个用户的输出流

                PrintStream ps = new PrintStream(os); //然后将输出流转换为打印流
                ps.println(msg); //再用打印流打印到他们的屏幕上
            }
        }

    }

}
