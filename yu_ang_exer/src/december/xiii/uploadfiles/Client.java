package december.xiii.uploadfiles;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7218); //连接服务器

        Thread readThread = new Thread(new ReadMessage(socket)); //创建一个线程一直读取消息
        readThread.start();


        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println(fileName);

        System.out.println("等待回应····");
        while (true) {
            if(is.read() == 1)
                break;
        }
        //开始上传文件
        System.out.println("正在上传文件···");
        File file = new File(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));


        int len;
        byte[] buf = new byte[1024];
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }
        bos.flush();
        socket.shutdownOutput();
        System.out.println("文件上传完成");
    }
}
