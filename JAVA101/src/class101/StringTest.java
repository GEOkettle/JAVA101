package class101;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c3 = Class.forName("java.lang.String");

        // Get the constructors of the String class
        Constructor<?>[] cons = c3.getConstructors();
        for(Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println();

        // Get the methods of the String class
        Method[] methods = c3.getMethods();
        for(Method method : methods) {
            System.out.println(method);
        }
    }
}