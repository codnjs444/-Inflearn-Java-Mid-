package collection.link;

import java.util.LinkedList;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        System.out.println("첫 항목에 추가");
        list.add(0,"z");
        System.out.println(list);
        
        System.out.println("첫 항목에 삭제");
        list.remove(0);
        System.out.println(list);

        System.out.println("중간 항목에 추가");
        list.add(2,"zz");
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(2);
        System.out.println(list);
        
        
        

    }
}
