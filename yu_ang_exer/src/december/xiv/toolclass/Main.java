package december.xiv.toolclass;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person p = new Person("Tom",12);
        String className = p.getClass().getName();
        System.out.println(Methods.getReturnValue(className, "introduceSelf", new String[]{"CN"}));

        Person p1 = (Person) Methods.useSetFieldMethod(className,"name","Tony");
        System.out.println(p1);
        String[] fields = new String[2];
        fields[0] = "name";
        fields[1] = "age";

        Object[] objects = new Object[2];
        objects[0] = "JESS";
        objects[1] = 17;
        Person p2 =(Person)Methods.setField(className, fields,objects);
        System.out.println(p2);
    }
}
