package enumeration.ref3;


public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(Grade.BASIC, price);
        System.out.println("discount = " + discount);

    }
}
