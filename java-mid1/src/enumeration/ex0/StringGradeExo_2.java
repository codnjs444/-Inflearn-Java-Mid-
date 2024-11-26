package enumeration.ex0;

public class StringGradeExo_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int vip = discountService.discount("vip", price);


        System.out.println("VIP 등급 할인 금액 : " + vip);

    }
}
