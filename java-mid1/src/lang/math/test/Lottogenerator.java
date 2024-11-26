package lang.math.test;

import java.util.Random;

public class Lottogenerator {
    private final Random random = new Random();
    private int[] lottoNumber = new int[6];
    private int count = 0;
    private int count2 = 0;
    private int count3 = 0;

    public int[] generate() {
        while (count < lottoNumber.length) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) { // 중복 체크
                System.out.println("generate 실행 [" + count3 + "]");
                lottoNumber[count] = number;
                count++;
                System.out.println("lottoNumber[" + count + "] = " + number);
            }
        }
        return lottoNumber;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumber[i] == number) {
                System.out.println("isUnique [false] 실행 [" + count2 + "]");
                return false; // 중복이면 false 반환
            }
        }
        System.out.println("isUnique [true] 실행 [" + count2 + "]");
        return true;
    }
}
