package stucturePattern.decoratorPattern.example1;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 09:35
 * @Description:
 *
 *      · 装饰者与被装饰者的超类
 *      · 用于定义基本的行为（+属性）
 *      · 一般为抽象类或接口
 *
 */
public abstract class Sweet {

    // 属性
    protected String name;

    // 方法一、获取名称
    public String getName() {
        return this.name;
    }

    // 方法二、获取价格
    // abstract的原因是 装饰者类和被装饰者类（子类）必须重写该方法
    public abstract double cost();

}
