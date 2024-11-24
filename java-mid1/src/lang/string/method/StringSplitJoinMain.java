package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for(String s : splitStr){
            System.out.println(s);
        }

//        String joinStr = "";
//        for (String string : splitStr) {
//            joinStr += string + "-";
//        }

        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        String joinedStr = String.join("=", "A", "B", "c");
        System.out.println(joinedStr);

        String result = String.join("=", splitStr);
        System.out.println("result : " + result);

    }
}
