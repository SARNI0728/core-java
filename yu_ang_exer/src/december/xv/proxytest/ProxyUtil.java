package december.xv.proxytest;

import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Scanner;

public class ProxyUtil {
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (!login()) {
                            System.out.println("登录失败，拒绝访问！");
                            return null;
                        }
                        if (target instanceof FinancialManageClass) {
                            writeLog(method.getName());
                        }
                        return method.invoke(target, args);
                    }
                });
    }
    private static boolean login() throws Exception {
        System.out.println(">> 请先登录 <<");
        Scanner sc = new Scanner(System.in);
        System.out.print("账号：");
        String inputName = sc.next();
        System.out.print("密码：");
        String inputPwd = sc.next();

        // 反射读取实体类 AdminLogin 上的注解配置
        Class<AdminLogin> clazz = AdminLogin.class;
        Field nameField = clazz.getField("username");
        Field pwdField = clazz.getField("password");

        // 获取注解里的值
        String rightName = nameField.getAnnotation(InjectValue.class).value();
        String rightPwd = pwdField.getAnnotation(InjectValue.class).value();

        return inputName.equals(rightName) && inputPwd.equals(rightPwd);
    }

    private static void writeLog(String methodName) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            String time = new Date().toString();
            String msg = "操作人：admin, 时间：" + time + ", 方法：" + methodName + "\r\n";
            fw.write(msg);
            System.out.println("【日志】已记录操作流水...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
