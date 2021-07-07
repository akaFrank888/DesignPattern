package buildPattern.abstractFactoryPattern.factory;

import buildPattern.abstractFactoryPattern.AbstractFactory;
import buildPattern.abstractFactoryPattern.Computer;
import buildPattern.abstractFactoryPattern.Phone;
import buildPattern.abstractFactoryPattern.domain.ComputerApple;
import buildPattern.abstractFactoryPattern.domain.PhoneApple;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 15:34
 * @Description:
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Phone createPhone() {
        return new PhoneApple();
    }

    @Override
    public Computer createComputer() {
        return new ComputerApple();
    }
}
