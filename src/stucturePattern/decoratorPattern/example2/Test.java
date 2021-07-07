package stucturePattern.decoratorPattern.example2;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 10:16
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        Hamburger hamburger = new ChickenBurger();
        LettuceDecorator lettuceDecorator = new LettuceDecorator(hamburger);
        System.out.println(lettuceDecorator.getName() + "————总共花费" + lettuceDecorator.cost());

        Hamburger hamburger1 = new PepperDecorator(lettuceDecorator);
        System.out.println(hamburger1.getName() + "————总共花费" + hamburger1.cost());

    }
}
