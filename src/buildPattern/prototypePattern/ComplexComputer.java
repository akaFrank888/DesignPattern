package buildPattern.prototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: yxl15
 * @Date: 2021/2/6 14:56
 * @Description:
 *
 *      原型模式深复制的原型对象
 *
 */
public class ComplexComputer implements Cloneable{

    // 基本数据类型和引用数据类型
    private String cpu;
    private String memory;

    private Disk disk;
    private Map<Integer,String> screen;

    public ComplexComputer(String cpu, String memory, Disk disk, Map<Integer, String> screen) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
        this.screen = screen;
    }

    // 重写方法（虽然原方法返回的是Object，但也可以写成具体的类）
    @SuppressWarnings("unchecked")
    protected ComplexComputer clone() {

        ComplexComputer complexComputer = null;

        // 先复制基本数据类型
        try {
            complexComputer = (ComplexComputer) super.clone();
            complexComputer.disk = this.disk.clone();
            // HashMap类中实现了Cloneable接口，所以先强转成HashMap才能调用clone，最后再转成原类型Map
            complexComputer.screen = (Map<Integer,String>)((HashMap<Integer,String>)this.screen).clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return complexComputer;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public Map<Integer, String> getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return "ComplexComputer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk=" + disk +
                ", screen=" + screen +
                '}';
    }
}
