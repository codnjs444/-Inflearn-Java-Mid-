package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setValue(20);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("hello");
        String str = stringGenericBox.getValue();
        System.out.println("str = " + str);

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
    }
}
