package buildPattern.singletonPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 20:48
 * @Description:
 *
 *      单例模式：  静态内部类
 */
public class Singleton {

    // 创建静态内部类
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    // 私有构造方法
    private Singleton() {}

    // 公有静态方法来获取单例对象，并且是final修饰
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
