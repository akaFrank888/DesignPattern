package stucturePattern.facadePattern;

import stucturePattern.facadePattern.subSystem.AirCondition;
import stucturePattern.facadePattern.subSystem.Light;
import stucturePattern.facadePattern.subSystem.Television;

/**
 * @Auther: yxl15
 * @Date: 2021/2/20 14:41
 * @Description:
 *
 *          客户端调用外观类
 *
 */
public class ClientTest {

    public static void main(String[] args) {

        // 创建子系统
        Light light = new Light();
        AirCondition airCondition = new AirCondition();
        Television television = new Television();

        // 创建外观类
        Facade facade = new Facade(light, airCondition, television);

        // 调用外观类方法
        facade.on();

        System.out.println("-------------------------");

        facade.off();

    }
}
