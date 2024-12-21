package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n작업을 선택하세요: 1) 단어 추가  2) 단어 검색  3) 종료");
            String choice = scanner.nextLine();

            if (choice.equals("3")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case "1": // 단어 추가
                    System.out.println("영어 단어를 입력하세요 (종료는 'q'):");
                    String englishWord = scanner.nextLine();
                    if (englishWord.equals("q")) {
                        break;
                    }

                    System.out.println("한글 뜻을 입력하세요:");
                    String koreanMeaning = scanner.nextLine();
                    dictionary.put(englishWord, koreanMeaning);
                    System.out.println("단어가 추가되었습니다.");
                    break;

                case "2": // 단어 검색
                    System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q'):");
                    String searchWord = scanner.nextLine();
                    if (searchWord.equals("q")) {
                        break;
                    }

                    if (dictionary.containsKey(searchWord)) {
                        System.out.println(searchWord + "의 뜻: " + dictionary.get(searchWord));
                    } else {
                        System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
