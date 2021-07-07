package buildPattern.abstractFactoryPattern.factory;

import buildPattern.abstractFactoryPattern.AbstractFactory;
import buildPattern.abstractFactoryPattern.Computer;
import buildPattern.abstractFactoryPattern.Phone;
import buildPattern.abstractFactoryPattern.domain.ComputerHuaWei;
import buildPattern.abstractFactoryPattern.domain.PhoneHuaWei;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 15:34
 * @Description:
 */
public class HuaWeiFactory extends AbstractFactory {
    @Override
    public Phone createPhone() {
        return new PhoneHuaWei();
    }

    @Override
    public Computer createComputer() {
        return new ComputerHuaWei();
    }
}
