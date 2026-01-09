package december.xv.proxytest;

public class AdminLogin {
    @InjectValue("admin")    // 正确账号
    public String username;

    @InjectValue("123456")   // 正确密码
    public String password;
}
