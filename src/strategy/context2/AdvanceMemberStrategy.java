package strategy.context2;

/**
 * 高级会员折扣类
 * 
 * @author Administrator
 *
 */
public class AdvanceMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }

}
