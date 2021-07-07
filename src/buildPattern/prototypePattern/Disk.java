package buildPattern.prototypePattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/6 14:58
 * @Description:
 *
 *      深复制中的引用数据类型
 *
 */
public class Disk implements Cloneable{

    private String ssd;
    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }

    // 重写方法
    protected Disk clone() {
        Disk disk = null;

        try {
            disk = (Disk) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return disk;
    }

    public String getSsd() {
        return ssd;
    }

    public String getHhd() {
        return hhd;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "ssd='" + ssd + '\'' +
                ", hhd='" + hhd + '\'' +
                '}';
    }
}
