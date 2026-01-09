package december.vii.muti_threadcopy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String video1SrcPath = "/Users/sarni/MySQL基础/3.视频/day01_ MySQL的安装与配置/教学视频/10.MySQL目录结构的认识&了解密码重置操作.mp4";
        String video1DestPath = "/Users/sarni/MySQL基础/3.视频/day01_ MySQL的安装与配置";

        String video2SrcPath = "/Users/sarni/MySQL基础/3.视频/day01_ MySQL的安装与配置/教学视频/9.MySQL图形化工具的使用.mp4";

        String video3SrcPath = "/Users/sarni/MySQL基础/3.视频/day01_ MySQL的安装与配置/教学视频/8.MySQL的基本使用.mp4";

        CopyThread ct1 = new CopyThread(video1SrcPath, video1DestPath);
        CopyThread ct2 = new CopyThread(video2SrcPath, video1DestPath);
        CopyThread ct3 = new CopyThread(video3SrcPath, video1DestPath);

        Thread t1 = new Thread(ct1);
        Thread t2 = new Thread(ct2);
        Thread t3 = new Thread(ct3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
}
