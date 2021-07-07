package stucturePattern.defaultAdapterPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/8 10:35
 * @Description:
 *
 *      缺省适配器中的实现类
 *
 */
@SuppressWarnings("all")

public class Target extends Adapter{

    @Override
    public void 习武() {
        System.out.println("鲁智深现在只会习武喔~");
    }

    public void 喝酒() {
        System.out.println("还会喝酒！");
    }

}
