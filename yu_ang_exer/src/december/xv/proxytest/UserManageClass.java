package december.xv.proxytest;

/*使用动态代理和自定义注解完成，业务要求如下
有一个接口，完成财务管理模块
针对上述接口，编写对应的实现类
有一个接口，完成用户管理模块
针对上述接口，编写对应的实现类
针对以上两个业务逻辑，通过JDK动态代理，完成两个功能
两个接口在执行时，必须先从键盘接收帐户和密码登录，帐户和密码要在登录的实体类对象属性上做注解配置，如果和注解配置的相同，则认为登录成功，可以进行业务方法的调用，如果登录失败，则直接跳过业务方法的调用
针对财务管理模块的业务逻辑，要实现将当前操作用户、当前系统时间、程序调用*/

public class UserManageClass implements UserManage {
    @Override
    public void userManageMethod() {
        System.out.println("正在进行用户管理···");
    }
}
