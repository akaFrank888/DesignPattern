package stucturePattern.decoratorPattern.example2;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 10:12
 * @Description:
 */
public class LettuceDecorator extends Decorator {

    private Hamburger hamburger;

    public LettuceDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName()+"，加生菜";
    }

    @Override
    public double cost() {
        return hamburger.cost() + 3;
    }
}
