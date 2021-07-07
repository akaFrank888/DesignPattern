package stucturePattern.decoratorPattern.example1;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 09:42
 * @Description:
 *
 *      被装饰的类
 *
 */
public class Cake extends Sweet {

    // 构造方法
    public Cake() {
        name = "一个蛋糕";
    }

    @Override
    public double cost() {
        return 66;
    }

}
