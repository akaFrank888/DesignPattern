package stucturePattern.facadePattern;

import stucturePattern.facadePattern.subSystem.AirCondition;
import stucturePattern.facadePattern.subSystem.Light;
import stucturePattern.facadePattern.subSystem.Television;

/**
 * @Auther: yxl15
 * @Date: 2021/2/20 14:56
 * @Description:
 *
 *      外观模式的 外观类
 *
 */
public class Facade {

    // 三个子系统
    private Light light;
    private AirCondition airCondition;
    private Television television;

    public Facade(Light light, AirCondition airCondition, Television television) {
        this.light = light;
        this.airCondition = airCondition;
        this.television = television;
    }

    // 设计面向用户的方法
    public void on() {
        light.on();
        airCondition.on();
        television.on();
    }

    public void off() {
        light.off();
        airCondition.off();
        television.off();
    }

    // getter
    public Light getLight() {
        return light;
    }

    public AirCondition getAirCondition() {
        return airCondition;
    }

    public Television getTelevision() {
        return television;
    }
}
