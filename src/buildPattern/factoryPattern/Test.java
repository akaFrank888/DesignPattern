package buildPattern.factoryPattern;

import buildPattern.factoryPattern.domain.Phone;
import buildPattern.factoryPattern.factory.Factory;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 14:48
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // 创建工厂
        Factory factory = new Factory();
        // 利用工厂，创建手机
        Phone iphone = factory.createPhone("Iphone");
        Phone huaWei = factory.createPhone("HuaWei");
        // 输出品牌
        iphone.brand();
        huaWei.brand();

    }
}
