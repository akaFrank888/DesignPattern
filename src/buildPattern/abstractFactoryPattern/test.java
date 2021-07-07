package buildPattern.abstractFactoryPattern;

import buildPattern.abstractFactoryPattern.factory.HuaWeiFactory;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 15:43
 * @Description:
 */
public class test {

    public static void main(String[] args) {

        // 一、创建 华为手机
        // 1. 先创建华为厂商
        AbstractFactory factory = new HuaWeiFactory();
        // 2. 创建华为手机生产线
        Phone huaWei = factory.createPhone();
        // 3. 调用方法
        huaWei.call();
    }
}
