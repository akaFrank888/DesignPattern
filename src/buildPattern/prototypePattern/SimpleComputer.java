package buildPattern.prototypePattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/6 14:44
 * @Description:
 *
 *      原型模式浅复制的原型对象
 *
 */
public class SimpleComputer implements Cloneable{

    // 对象中的基本数据类型
    private String cpu;
    private String memory;
    private String disk;

    public SimpleComputer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }


    // 重写clone方法
    protected SimpleComputer clone() {
        SimpleComputer simpleComputer = null;

        try {
            simpleComputer = (SimpleComputer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return simpleComputer;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getDisk() {
        return disk;
    }

    @Override
    public String toString() {
        return "SimpleComputer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
