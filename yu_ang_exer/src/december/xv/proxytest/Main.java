package december.xv.proxytest;

public class Main {
    public static void main(String[] args) {
        // 1. 创建原始对象 (这里用实现类没问题)
        FinancialManageClass finance = new FinancialManageClass();
        UserManageClass user = new UserManageClass();

        // 2. 创建代理对象
        // 【核心修改点 1】: 变量类型改成接口 FinancialManage
        // 【核心修改点 2】: 强转类型改成接口 (FinancialManage)
        FinancialManage financeProxy = (FinancialManage) ProxyUtil.createProxy(finance);

        // 用户模块同理修改
        // 【核心修改点 3】: 变量类型改成接口 UserManage
        // 【核心修改点 4】: 强转类型改成接口 (UserManage)
        UserManage userProxy = (UserManage) ProxyUtil.createProxy(user);

        // 3. 调用测试
        System.out.println("--------- 测试财务模块 ---------");
        financeProxy.financialManageMethod();

        System.out.println("\n--------- 测试用户模块 ---------");
        userProxy.userManageMethod();
    }
}
