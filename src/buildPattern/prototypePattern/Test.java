package buildPattern.prototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: yxl15
 * @Date: 2021/2/6 14:54
 * @Description:
 *
 *      原型模式的测试类
 *
 */
public class Test {

    public static void main(String[] args) {

        // 浅复制
        SimpleComputer protoType = new SimpleComputer("inter", "8G", "1TB");
        SimpleComputer clone1 =  protoType.clone();
        SimpleComputer clone2 =  protoType.clone();
        System.out.println(clone1);
        System.out.println(clone2);

        System.out.println("---------------------------------------");

        // 深复制
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "screen1");
        Disk disk = new Disk("ssd1", "hhd1");

        ComplexComputer complexComputer = new ComplexComputer("inter", "4G", disk, map);
        ComplexComputer cloneComputer1 = complexComputer.clone();

        // 修改引用数据类型，观察是否影响其他复制后的对象
        //cloneComputer1.getScreen().remove(1);

        ComplexComputer cloneComputer2 = complexComputer.clone();
        System.out.println(cloneComputer1);
        System.out.println(cloneComputer2);

    }
}
