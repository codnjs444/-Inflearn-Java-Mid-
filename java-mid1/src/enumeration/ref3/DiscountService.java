package enumeration.ref3;


public class DiscountService {
    public int discount(Grade classGrade, int price) {
        return classGrade.discount(price);
    }
}
