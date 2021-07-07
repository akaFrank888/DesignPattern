package buildPattern.BuilderPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/4 15:06
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        // 在客户端使用链式调用来创建对象

        // 创建一台电脑对象，选择配备鼠标和键盘
        Computer computer = new Computer.Builder("因特尔", "三星")
                .setMouse("罗技")
                .setKeyboard("妙控键盘")
                .build();
        System.out.println(computer);
    }
}
