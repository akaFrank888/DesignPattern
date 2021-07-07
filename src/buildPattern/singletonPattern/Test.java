package buildPattern.singletonPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/2 20:40
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

          // 1. 懒汉式
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println("=========================");
        // 2. 饿汉式
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println("=========================");
        // 3. 静态内部类
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println("=========================");
        // 4. 双重校验锁
        System.out.println(DoubleLockSingleton.getInstance());
        System.out.println(DoubleLockSingleton.getInstance());
    }
}
