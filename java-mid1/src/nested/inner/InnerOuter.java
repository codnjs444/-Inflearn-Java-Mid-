package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstancevalue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);
            System.out.println("outInstancevalue = " + outInstancevalue);
            System.out.println(outClassValue);
        }
    }
}
