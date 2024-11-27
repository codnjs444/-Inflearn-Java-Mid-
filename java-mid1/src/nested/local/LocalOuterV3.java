package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private final int outInstanceVar = 3;

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer printer = localOuterV3.process(2);
        printer.print();

        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수

        class LocalPrinter implements Printer {
            final int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        return new LocalPrinter();
    }
}
