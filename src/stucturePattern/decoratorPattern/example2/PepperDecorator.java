package stucturePattern.decoratorPattern.example2;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 10:15
 * @Description:
 */
public class PepperDecorator extends Decorator {

    private Hamburger hamburger;

    public PepperDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName()+"，加辣椒";
    }

    @Override
    public double cost() {
        return hamburger.cost() + 1;
    }
}
