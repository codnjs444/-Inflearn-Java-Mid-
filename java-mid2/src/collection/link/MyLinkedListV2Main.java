package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add(2,"a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("c");
        System.out.println(list);


    }
}
