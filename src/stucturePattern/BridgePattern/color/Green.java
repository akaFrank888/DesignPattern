package stucturePattern.BridgePattern.color;

import stucturePattern.BridgePattern.Color;

/**
 * @Auther: yxl15
 * @Date: 2021/3/1 16:46
 * @Description:
 */
public class Green implements Color {
    @Override
    public void paint() {
        System.out.println("涂上绿色");
    }
}
