import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //这是客户端的main线程，主要任务就是给用户开启接受消息和发送消息两条线程
        Socket socket = new Socket("127.0.0.1",7218); //让客户端连接某个服务器上的端口

        ReceiveMessage receiveMessage = new ReceiveMessage(socket);
        receiveMessage.start();

        SendMessage sendMessage = new SendMessage(socket);
        sendMessage.start();

        sendMessage.join();
        //join方法的作用就是让主线程等待子线程执行完毕再接着执行主线程
        //join的有个意思是“合并”，就是控制main方法和子线程在某个点汇合

        socket.close();
    }

}
class SendMessage extends Thread{
    Socket socket;

    SendMessage(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try{
            Scanner sc = new Scanner(System.in);
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            while(true){
                System.out.println("自己的话：");
                String msg = sc.nextLine(); //nextLine是个阻塞式方法，它会一直等待用户的输入
                if(msg.equals("exit")){
                    break;
                }
                printStream.println(msg); //这一步是真正的把客户端的内容送给服务器端
            }

            printStream.close(); //当这个流关闭以后，服务器那端就检测到这个流==null，然后在服务器中删除这个人
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class ReceiveMessage extends Thread{
    Socket socket;
    ReceiveMessage(Socket socket){
        this.socket = socket;
    }
    public void run(){
        try {
            InputStream inputStream = socket.getInputStream(); //拿到这个客户端对应线程的输入流
            Scanner sc = new Scanner(inputStream);

            while(sc.hasNextLine()){
                String msg = sc.nextLine();
                System.out.println(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
