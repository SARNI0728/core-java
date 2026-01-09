package december.iii;

/*使用lambda表达式完成如下操作
使用jdk内置函数式接口，对两个整数进行相关运算，最后返回一个整数
使用jdk内置函数式接口，向一个集合中加入10个100以内随机数
使用jdk内置函数式接口，将练习2中的数字进行过滤，将所有偶数加到一个集合中
创建一个学生类，属性包括姓名、年龄。使用构造方法引用，创建3个对象，加入到一个List集合。使用外部排序器和方法引用，按年龄升序排列*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        ArrayList<Integer> integers = new ArrayList<>();
        Supplier<Integer> supplier = () -> (int)(Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            integers.add(supplier.get());
        }
        integers.forEach(System.out::println);
        System.out.println("筛选···");
        ArrayList<Integer> newList = new ArrayList<>(integers.stream().filter(integer -> integer % 2 == 0).toList());
        newList.forEach(System.out::println);

        String className = "december.iii.Person";
        Class clazz = Class.forName(className);
        Constructor cons = clazz.getConstructor(String.class,int.class);
        Person p1 = (Person)cons.newInstance("Tom",60);
        Person p2 = (Person)cons.newInstance("Tony",16);
        Person p3 = (Person)cons.newInstance("Jack",21);

        ArrayList<Person> peoples = new ArrayList<>(List.of(p1, p2, p3));
        Comparator<Person> comparator = (person1,person2) -> person1.getAge()-person2.getAge();
        peoples.sort(comparator);
        peoples.forEach(System.out::println);

    }
}

