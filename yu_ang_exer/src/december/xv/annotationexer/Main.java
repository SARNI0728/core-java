package december.xv.annotationexer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> c = Person.class;
        Person p = c.getDeclaredConstructor().newInstance();

        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(InjectValue.class)) {
                InjectValue annotation = field.getAnnotation(InjectValue.class);
                String valueOnTag =  annotation.value();

                field.set(p,valueOnTag);
            }
        }
        System.out.println(p);
    }
}
