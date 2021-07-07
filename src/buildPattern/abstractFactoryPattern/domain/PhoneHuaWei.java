package buildPattern.abstractFactoryPattern.domain;

import buildPattern.abstractFactoryPattern.Phone;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 15:32
 * @Description:
 */
public class PhoneHuaWei implements Phone {
    @Override
    public void call() {
        System.out.println("using phoneHuaWei calling");
    }
}
