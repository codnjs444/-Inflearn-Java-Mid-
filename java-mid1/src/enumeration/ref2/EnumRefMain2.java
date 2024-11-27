package enumeration.ref2;


public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(Grade.BASIC, price);
        System.out.println("discount = " + discount);

    }
}
