package stucturePattern.adapterPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/8 10:00
 * @Description:
 *
 *      对象适配器模式中的 适配器类
 */
public class ObjectAdapter implements Target {

    private Source source = new Source();

    @Override
    public void editTextFile() {
        this.source.editTextFile();
    }

    @Override
    public void editWordFile() {
        System.out.println("我还能编辑word文件");
    }

}
