package stucturePattern.proxyPattern.staticProxy;

/**
 * @Auther: yxl15
 * @Date: 2021/2/15 08:35
 * @Description:
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService service) {
        userService = service;
    }

    @Override
    public void add() {
        System.out.println("打印日志...");
        userService.add();
    }

}
