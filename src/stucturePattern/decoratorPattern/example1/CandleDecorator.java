package stucturePattern.decoratorPattern.example1;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 09:48
 * @Description:
 *
 *      装饰者类的具体实现类之一
 *
 */
public class CandleDecorator extends Decorator {

    private Sweet sweet;

    public CandleDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getName() {
        return sweet.getName()+"，加蜡烛";
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }

}
