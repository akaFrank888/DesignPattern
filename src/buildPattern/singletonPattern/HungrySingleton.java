package buildPattern.singletonPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 20:44
 * @Description:
 */
public class HungrySingleton {

    // 私有静态属性
    private static HungrySingleton instance = new HungrySingleton();

    // 私有构造方法
    private HungrySingleton() {}

    // 公有静态方法来获取单例对象
    public static HungrySingleton getInstance() {
        return instance;
    }

}
