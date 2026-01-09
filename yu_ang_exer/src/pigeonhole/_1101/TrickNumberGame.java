package pigeonhole._1101;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/1 13:16
 * @Version 1.0
 */
public class TrickNumberGame {
    public static void main(String[] args) {
        System.out.print("请输入的你的名字：");
        String str = new Scanner(System.in).nextLine();
        System.out.print("请输入你瞬间想到的数字：");
        int x = new Scanner(System.in).nextInt() % 10;
        int y = 9 * x;
        int z = (y / 10 + y % 10) * 27 + 7;
        System.out.println("\n启动科学计算模块……\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] theorems = {
                "拉普拉斯随机动力学定理",
                "费马–泰勒奇异积分公式",
                "庞加莱超复数映射定理",
                "黎曼概率波动模型",
                "高斯–纽曼量子连续算法",
                "欧拉–冯·诺依曼最优预测公式",
                "希尔伯特–李奇空间演化理论",
                "科西–雅可比非线性映射定理"
        };
        System.out.println("正在调用科学数据库进行计算：");
        for (int i = 0; i < 5; i++) {
            System.out.println("  - " + theorems[(int)(Math.random() * theorems.length)]);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n宇宙能量波动中……");
        for (int i = 0; i < 5; i++) {
            double mysticNum = Math.random() * 1000;
            System.out.printf("  %.2f\n", mysticNum);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String[] spells = {
                "嗡~啊~唵~",
                "咕噜~咕噜~",
                "沙啦~咪~",
                "呼呼~呼~",
                "咚咚锵~咚咚锵~",
                "呜噜~咻~咻~"
        };
        System.out.println("神秘算命师开始念咒语：");
//        for (int i = 0; i < 7; i++) {
//            System.out.println("  " + spells[(int)(Math.random() * spells.length)]);
//            try {
//                Thread.sleep(700); // 暂停增加神秘感
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        double percent = ((Math.random() * 1000) + 9000)/100;
        System.out.printf("(%.2f", percent);
        if(str.equals("刘亚宁")){
            System.out.println("%准确度)：" + str + ",最终结果经过MLP加权映射,你的幸运数字是：" + 54188);
            System.exit(0);
        }
            System.out.println("%准确度)：" + str + ",最终结果经过MLP加权映射,你的幸运数字是：" + z);
    }
}
