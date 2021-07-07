package stucturePattern.BridgePattern;

import stucturePattern.BridgePattern.color.Red;
import stucturePattern.BridgePattern.shape.Circle;

/**
 * @Auther: yxl15
 * @Date: 2021/3/1 16:47
 * @Description:
 *
 *      桥接模式的测试类
 *
 */
public class Test {

    public static void main(String[] args) {

        Color red = new Red();
        Shape circle = new Circle();
        circle.setColor(red);
        circle.draw();

    }
}
