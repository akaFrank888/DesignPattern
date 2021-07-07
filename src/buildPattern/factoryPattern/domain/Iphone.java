package buildPattern.factoryPattern.domain;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 14:44
 * @Description:
 *
 *      产品实现类
 *
 */
public class Iphone implements Phone {
    @Override
    public void brand() {
        System.out.println("This is a Iphone");
    }
}
