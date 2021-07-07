package stucturePattern.decoratorPattern.example2;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 10:08
 * @Description:
 *
 *      共同超类
 *
 */
public abstract class Hamburger {

    protected String name;

    public String getName() {
        return this.name;
    }

    public abstract double cost();
}
