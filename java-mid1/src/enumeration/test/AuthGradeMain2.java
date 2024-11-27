package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        new AuthGradeMain2().enter();
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] : ");
        String grade = scanner.nextLine().trim().toUpperCase();

        AuthGrade authGrade = AuthGrade.valueOf(grade);

        String[] menus = { "메인화면", "이메일 관리화면", "관리자 화면" };

        System.out.println("== 메뉴 목록 ==");
        for (int i = 0; i < authGrade.getLevel(); i++) {
            System.out.println("- " + menus[i]);
        }
    }
}
