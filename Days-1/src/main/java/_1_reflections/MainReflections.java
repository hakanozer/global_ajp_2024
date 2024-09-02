package _1_reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflections {

    public static void main(String[] args) {
        Object action = new Action();
        Class clazz = action.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println( field.getName() );
            System.out.println( field.getType().getName() );
            System.out.println( field.getModifiers() );
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println( annotation.annotationType().getName() );
            }
            System.out.println("========Filed=======");
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println( method.getName() );
            System.out.println( method.getParameterTypes().length );
            Class[] types = method.getParameterTypes();
            for (Class type : types) {
                System.out.println(type);
            }
            System.out.println("========Method=======");
        }

    }

}
