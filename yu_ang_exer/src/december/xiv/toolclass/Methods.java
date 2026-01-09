package december.xiv.toolclass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//编写一个工具类，
//方法一：只要传入类名、方法名和参数数组，就能获取该方法的返回值
//方法二：只要传入类名、属性名和属性值，就可以调用该属性的setXXX()方法为其赋值，并返回这个类的对象
//方法三：只要传入类名、属性数组和属性值数组，就可以为该类的给定属性赋值，并返回这个类的对象
public class Methods {
    //只要传入类名、属性数组和属性值数组，就可以为该类的给定属性赋值，并返回这个类的对象
    public static Object setField(String className, String[] fieldName, Object[] value) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> c = Class.forName(className);

        Object o = c.getDeclaredConstructor().newInstance();
        for (int i = 0; i < value.length; i++) {
            String name = fieldName[i];
            Object fieldValue = value[i];

            Field f = c.getDeclaredField(name);
            f.setAccessible(true);

            f.set(o, fieldValue);
        }

        return o;
    }

    //只要传入类名、属性名和属性值，就可以调用该属性的setXXX()方法为其赋值，并返回这个类的对象
    public static Object useSetFieldMethod(String className,String fieldName,Object value) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> c = Class.forName(className);
        Method m = c.getMethod("set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1),value.getClass());
        Object instance = c.getDeclaredConstructor().newInstance();
        m.invoke(instance,value);
        return instance;
    }


    //只要传入类名、方法名和参数数组，就能获取该方法的返回值
    public static Object getReturnValue(String className,String methodName,Object[] values) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName(className);
        Class<?>[] args = new Class[values.length];

        for (int i = 0; i < values.length; i++) {
            args[i] = values[i].getClass();
        }

        Method m = c.getMethod(methodName, args);

        Object instance = c.getDeclaredConstructor().newInstance(); //创建一个新实例

        return m.invoke(instance, values);
    }
}
