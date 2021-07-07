package stucturePattern.BridgePattern.shape;

import stucturePattern.BridgePattern.Shape;

/**
 * @Auther: yxl15
 * @Date: 2021/3/1 16:45
 * @Description:
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
