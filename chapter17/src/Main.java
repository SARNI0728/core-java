import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    3.1 调用指定的属性（步骤）
    步骤1.通过Class实例调用getDeclaredField(String fieldName)，获取运行时类指定名的属性
    步骤2. setAccessible(true)：确保此属性是可以访问的
    步骤3. 通过Filed类的实例调用get(Object obj) （获取的操作）或 set(Object obj,Object value) （设置的操作）进行操作。
*/
public class Main {
    public static void main(String[] args) throws Exception {
        Class clazz = Person.class;
        Person per = (Person) clazz.newInstance();
        Field agefield = clazz.getDeclaredField("age");
        agefield.setAccessible(true);
        agefield.set(per, 18);
        Field namefield = clazz.getDeclaredField("name");
        namefield.setAccessible(true);
        namefield.set(per,"Oli");
        System.out.println(per);
    }
    /*3.2 调用指定的方法（步骤）
        步骤1.通过Class的实例调用getDeclaredMethod(String methodName,Class ... args),获取指定的方法
        步骤2. setAccessible(true)：确保此方法是可访问的
        步骤3.通过Method实例调用invoke(Object obj,Object ... objs),即为对Method对应的方法的调用。
    invoke()的返回值即为Method对应的方法的返回值
    特别的：如果Method对应的方法的返回值类型为void，则invoke()返回值为null*/
    @Test
    public void test1() throws Exception {
        Class clazz = Person.class;
        Person per = (Person) clazz.newInstance();
        Method method =  clazz.getDeclaredMethod("talking", int.class, String.class);
        method.setAccessible(true);
        Object obj = method.invoke(per,4,"balabla");
        System.out.println((String) obj);
    }

//    3.3 调用指定的构造器（步骤）
//步骤1.通过Class的实例调用getDeclaredConstructor(Class ... args)，获取指定参数类型的构造器
//步骤2.setAccessible(true)：确保此构造器是可以访问的
//步骤3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类的实例。
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;
        Constructor constructor  = clazz.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Person obj = (Person)constructor.newInstance("Oli",25);
        System.out.println(obj);
    }
}