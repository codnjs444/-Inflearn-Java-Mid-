package enumeration.ex3;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//        Grade grade = new Grade();
        int discount = discountService.discount(Grade.BASIC, price);
        System.out.println("discount = " + discount);

    }
}
