package december.xiii.uploadfiles;

/*通过TCP协议，完成客户端向服务器端上传文件功能。要求步骤如下：
客户端从键盘接收要上传的文件名，如果文件不存在，则提示用户文件不存在，直到用户输入的文件存在
客户端将要上传的文件名发送给服务器端，告知服务器，要上传文件
服务器端收到客户端要上传的文件名后，决定是否接收文件，如果不接收，则直接告知客户端拒绝接收，整个流程停止
如果服务器端同意接收文件，则从键盘录入要接收文件的目录，如果目录不存在，则创建目录，如果创建失败，则提示用户目录创建失败，直到创建成功，并告知客户端，已同意接收文件，可以上传
在客户端上传文件结束后，客户端显示上传文件成功，服务器端显示上传文件失败*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        //建立连接
        ServerSocket serverSocket = new ServerSocket(7218);
        System.out.println("套接字建立完毕。等待连接。");

        //等待客户端的连接
        Socket socket = serverSocket.accept();
        System.out.println(socket.getInetAddress() + "连接成功！");

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os); //获取给客户端的打印输出流

        ps.println("请输入文件名：");
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is); //将字节流转换为字符流
        BufferedReader br = new BufferedReader(isr);//再包一层转换流，这样就可以实现按行读取了。

        String msg = br.readLine(); //获取用户的输入
        File file = new File(msg);
        while (msg != null) { //检查用户的输入对应的文件是否存在。 若不存在则卡在这里。
            if (!file.exists()) {
                ps.println("对应的文件不存在，请重新输入。");
                msg = br.readLine();
            }else break;
        }
        ps.println("已检测到文件，正在等待人工审核···");
        System.out.println("用户想要上传文件" + msg + "，是否接受？(Y/N)");
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equalsIgnoreCase("y")) {
            System.out.println("选择了接受文件，请输入路径名。");
            os.write(1);
            File destDir = new File(sc.nextLine());

            if(destDir.mkdir()) System.out.println("文件夹创建完毕。");

            File newfile = new File(destDir,file.getName());
            try( //开始接收文件
                    BufferedInputStream bis = new BufferedInputStream(is);
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newfile));
                    ){
                byte[] buffer = new byte[1024];
                int len;
                while ((len = bis.read(buffer)) != -1) bos.write(buffer, 0, len);
                System.out.println("文件上传完成，保存在了目录：" + newfile.getAbsolutePath());
                ps.println("文件成功上传。");
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("选择了不接受文件，正在关闭客户端的连接。");
            ps.println('N');
            ps.println("服务器拒绝接受你的文件，连接正在关闭。");
        }
        socket.close();
    }
}
