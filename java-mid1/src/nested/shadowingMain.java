package nested;

public class shadowingMain {
    public int value = 1;

    class Inner{
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this = " + this.value);
            System.out.println("shadowingMain.this = " + shadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        shadowingMain shadowingMain = new shadowingMain();
        shadowingMain.new Inner().go();
    }
}
