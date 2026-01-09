package december.xiii.uploadfiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadMessage implements Runnable{ //从服务器不断的获取消息
    Socket socket;

    public ReadMessage(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(">>" + line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
