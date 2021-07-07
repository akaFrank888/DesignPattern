package buildPattern.factoryPattern.factory;

import buildPattern.factoryPattern.domain.HuaWei;
import buildPattern.factoryPattern.domain.Iphone;
import buildPattern.factoryPattern.domain.Phone;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 14:45
 * @Description:
 *
 *      工厂
 *
 */
public class Factory {

    // 定义一个方法————创建手机
    public Phone createPhone(String phoneName) {
        if (phoneName.equals("Iphone")) {
            return new Iphone();
        } else if (phoneName.equals("HuaWei")) {
            return new HuaWei();
        } else {
            return null;
        }
    }
}
