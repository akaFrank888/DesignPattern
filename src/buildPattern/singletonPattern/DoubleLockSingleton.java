package buildPattern.singletonPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 21:09
 * @Description:
 */
public class DoubleLockSingleton {

    // 对象锁
    private volatile static DoubleLockSingleton singleton;

    private DoubleLockSingleton() {

    }

    public static DoubleLockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
