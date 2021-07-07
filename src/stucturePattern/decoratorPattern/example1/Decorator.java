package stucturePattern.decoratorPattern.example1;

/**
 * @Auther: yxl15
 * @Date: 2021/2/14 09:49
 * @Description:
 *
 *      装饰者的超类
 *
 */
public abstract class Decorator extends Sweet {

    // abstract的目的是必须让该装饰者类的具体实现类重写该方法
    public abstract String getName();

}
