import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class FruitTest {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Properties p =  new Properties();
        File file = new File("/Users/sarni/Desktop/JAVA学习/javacode/javacode/JavaSECode/chapter17/src/config.properties");
        FileInputStream fis = new FileInputStream(file);

        p.load(fis);

        String fruitName = p.getProperty("fruitName");
        Class clazz = Class.forName(fruitName);
        Constructor constructor = clazz.getConstructor();
        Fruit fruit = (Fruit) constructor.newInstance();

        Juicer juicer = new Juicer();
        juicer.run(fruit);
    }
}
