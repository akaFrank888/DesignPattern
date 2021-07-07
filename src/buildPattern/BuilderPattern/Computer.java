package buildPattern.BuilderPattern;

/**
 * @Auther: yxl15
 * @Date: 2021/2/4 14:59
 * @Description:
 *
 *      建造者模式
 */
public class Computer {

    // 基本部件
    private String cpu;
    private String screen;
    // 选择性的部件
    private String keyboard;
    private String mouse;
    private String earphone;

    // 私有的构造方法
    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
        this.earphone = builder.earphone;
    }


    // 静态内部类
    public static class Builder {
        // 基本部件
        private String cpu;
        private String screen;
        // 选择性的部件
        private String keyboard;
        private String mouse;
        private String earphone;

        // 对基本部件的构造方法
        public Builder(String cpu, String screen) {
            this.cpu = cpu;
            this.screen = screen;
        }

        // 对其他部件的setter（不是一般的setter！要多返回本身！）
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder setEarphone(String earphone) {
            this.earphone = earphone;
            return this;
        }

        // build()方法
        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", earphone='" + earphone + '\'' +
                '}';
    }

}
