package stucturePattern.adapterPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/8 09:42
 * @Description:
 */
public class Adapter extends Source implements Target {
    @Override
    public void editWordFile() {
        System.out.println("我还能编辑word文件");
    }
}
