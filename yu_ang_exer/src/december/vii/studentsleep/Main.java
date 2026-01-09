package december.vii.studentsleep;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Thread studentThread = new Thread(() -> {
            //学生进程，会睡眠5秒。
            try {
                System.out.println("学生开始睡觉···");
                sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("学生苏醒了。");
            }
        });

        Thread teacherThread = new Thread(() -> {
            //老师进程，它会在喊三次上课以后唤醒学生进程。
            System.out.println("老师来了····");
            for (int i = 0; i < 3; i++) {
                System.out.println("上课！");
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            studentThread.interrupt();
        });

        studentThread.start();
        teacherThread.start();
    }
}
