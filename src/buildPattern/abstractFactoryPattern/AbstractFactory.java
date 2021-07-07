package buildPattern.abstractFactoryPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 15:34
 * @Description:
 *
 *      抽象工厂类（相当于 厂商）
 *
 */
public abstract class AbstractFactory {


    // 定义方法（声明 生产线）
    public abstract Phone createPhone();
    public abstract Computer createComputer();

}
