package buildPattern.singletonPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 20:37
 * @Description:
 */
public class LazySingleton {

    // 私有静态属性（static的原因是静态属性或方法是属于类的，能够很好的保障单例对象的唯一性）
    private static LazySingleton instance;

    // 私有构造方法
    private LazySingleton() {}

    // 公有静态的加锁方法来获取单例对象
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            // 切忌直接 return new LazySingleton（不是单例）
            instance = new LazySingleton();
        }
        return instance;
    }
}
