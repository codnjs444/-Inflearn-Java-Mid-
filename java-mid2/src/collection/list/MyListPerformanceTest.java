package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        int loop = 10_000;

        // === MyArrayList 테스트 ===
        System.out.println("\n===== MyArrayList 동작 =====");

        MyArrayList<Integer> arrayList = new MyArrayList<>();

        System.out.println("\n-- 앞에 추가 --");
        addFirst(new MyArrayList<>(), size);  // 새로운 MyArrayList로 앞에 추가 테스트

        System.out.println("\n-- 중간에 추가 --");
        addMid(new MyArrayList<>(), size);    // 새로운 MyArrayList로 중간에 추가 테스트

        System.out.println("\n-- 뒤에 추가 --");
        addLast(arrayList, size);             // 동일한 MyArrayList로 뒤에 추가 테스트

        System.out.println("\n== MyArrayList 조회 ==");
        getIndex(arrayList, loop, 0);         // 첫 번째 요소 조회
        getIndex(arrayList, loop, size / 2);  // 중간 요소 조회
        getIndex(arrayList, loop, size - 1);  // 마지막 요소 조회

         System.out.println("\n== MyArrayList 검색 ==");
        searchIndex(arrayList, loop, 0);         // 첫 번째 요소 조회
        searchIndex(arrayList, loop, size / 2);  // 중간 요소 조회
        searchIndex(arrayList, loop, size - 1);  // 마지막 요소 조회

        // === MyLinkedList 테스트 ===
        System.out.println("\n===== MyLinkedList 동작 =====");

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        System.out.println("\n-- 앞에 추가 --");
        addFirst(new MyLinkedList<>(), size); // 새로운 MyLinkedList로 앞에 추가 테스트

        System.out.println("\n-- 중간에 추가 --");
        addMid(new MyLinkedList<>(), size);   // 새로운 MyLinkedList로 중간에 추가 테스트

        System.out.println("\n-- 뒤에 추가 --");
        addLast(linkedList, size);            // 동일한 MyLinkedList로 뒤에 추가 테스트

        System.out.println("\n== MyLinkedList 조회 ==");
        getIndex(linkedList, loop, 0);        // 첫 번째 요소 조회
        getIndex(linkedList, loop, size / 2); // 중간 요소 조회
        getIndex(linkedList, loop, size - 1); // 마지막 요소 조회

        System.out.println("\n== MyLinkedList 검색 ==");
        searchIndex(linkedList, loop, 0);        // 첫 번째 요소 조회
        searchIndex(linkedList, loop, size / 2); // 중간 요소 조회
        searchIndex(linkedList, loop, size - 1); // 마지막 요소 조회
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void searchIndex(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
