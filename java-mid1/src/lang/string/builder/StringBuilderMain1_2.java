package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A").append("B").append("C").append("D").append("E");
        System.out.println("sb = " + sb);

        sb.insert(5, "Java");
        System.out.println("insert + " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("revelse = " + sb);

        sb.toString();
        System.out.println(sb);
    }
}
