package stucturePattern.adapterPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/8 09:43
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // 类适配器模式
        Target target = new Adapter();
        target.editTextFile();
        target.editWordFile();

        System.out.println("============================");

        // 对象适配器模式
        Target objectTarget = new ObjectAdapter();
        objectTarget.editTextFile();
        objectTarget.editWordFile();
    }
}
