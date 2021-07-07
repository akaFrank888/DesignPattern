package stucturePattern.decoratorPattern.example1;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 09:57
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        Sweet sweet = new Cake();
        FruitDecorator fruitDecorator = new FruitDecorator(sweet);
        System.out.println(fruitDecorator.getName() + "————总共花费" + fruitDecorator.cost() + "元");

        Sweet sweet1 = new CandleDecorator(fruitDecorator);
        System.out.println(sweet1.getName() + "————总共花费" + sweet1.cost() + "元");

    }

}
