package stucturePattern.decoratorPattern.example2;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 10:10
 * @Description:
 */
public class ChickenBurger extends Hamburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
