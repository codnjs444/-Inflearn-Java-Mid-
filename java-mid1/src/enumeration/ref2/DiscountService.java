package enumeration.ref2;



import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;

    }
}
