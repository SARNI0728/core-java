package december.xiv.genericerasure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

// 造一个范型为String的list，然后使用反射加入一个整数
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list = new ArrayList<>();
        list.add("String");

        Class c = list.getClass();

        Method m = c.getMethod("add",Object.class);

        m.invoke(list,15);

        System.out.println(list);

    }
}
