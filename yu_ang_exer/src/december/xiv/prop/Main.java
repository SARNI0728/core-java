package december.xiv.prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
//针对上面生成的类，在value.properties文件中，为所有的属性配置值，并通过反射机制进行赋值操作
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        String propFilePath = "/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/xiv/prop/config.properties";
        File propFile = new File(propFilePath);
        prop.load(new FileInputStream(propFile));

        String className = prop.getProperty("class.name");
        Class clazz = Class.forName(className);

        Constructor cons = clazz.getConstructor();

        Properties valueProp = new Properties(); //获取值 生成新类实例
        propFilePath = "/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/xiv/prop/value.properties";
        File valuePropFile = new File(propFilePath);
        valueProp.load(new FileInputStream(valuePropFile)); //获取值对应的properties文件

        Object obj = cons.newInstance();

        String rawTypes = prop.getProperty("property.types");
        String[] Types = rawTypes.split(","); //获取所有属性的类型

        String rawAttributes = prop.getProperty("property.names");
        String[] Attributes = rawAttributes.split(",");//获取所有变量名称



        //开始通过class方法对应的set方法为新实例赋值
        for (int i = 0; i < Attributes.length; i++) {
            String attributeName = Attributes[i];
            String type = Types[i];

            String methodName = "set" + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);

            Class<?> argClass;
            if ("int".equals(type)) {
                argClass = int.class;
            } else {
                argClass = String.class;
            }

            Method method = clazz.getMethod(methodName, argClass);

            String valueStr = valueProp.getProperty(attributeName);

            if ("int".equals(type)) {
                method.invoke(obj, Integer.parseInt(valueStr)); // 转成 int 塞进去
            } else {
                method.invoke(obj, valueStr); // 直接塞进去
            }
        }
        System.out.println("反射赋值完成，内容：");
        System.out.println(obj);
    }
}
