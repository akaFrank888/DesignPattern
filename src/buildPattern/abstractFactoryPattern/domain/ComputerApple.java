package buildPattern.abstractFactoryPattern.domain;

import buildPattern.abstractFactoryPattern.Computer;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 15:32
 * @Description:
 */
public class ComputerApple implements Computer {
    @Override
    public void internet() {
        System.out.println("using computerApple internet");
    }
}
