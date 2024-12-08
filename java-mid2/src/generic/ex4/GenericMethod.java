package generic.ex4;

public class GenericMethod {
    public static Object objectMethod(Object object) {
        System.out.println("Object : " + object);
        return object;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("Object : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Object : " + t);
        return t;
    }
}
