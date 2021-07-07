package stucturePattern.BridgePattern;

/**
 * @Auther: yxl15
 * @Date: 2021/3/1 14:33
 * @Description:
 *
 *      其中一个维度：形状
 *
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
