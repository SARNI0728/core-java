import org.junit.Test;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 21:00
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void Test1(){
        DAO<User> dao = new DAO<>();
        dao.save(String.valueOf(1),new User(1,21,"LYN"));
        dao.save(String.valueOf(2),new User(2,20,"LSX"));
        dao.save(String.valueOf(3),new User(3,19,"GZL"));
        dao.save(String.valueOf(4),new User(4,18,"GXT"));
        System.out.println(dao.list()); //测试打印所有对象

        System.out.println(dao.get("1")); //测试取出一个

        dao.update("4",new User(5,21,"ZHZ"));
        System.out.println(dao.get("4"));//测试交换函数
        System.out.println(dao.list()); //测试打印所有对象

        dao.delete("4");
        System.out.println(dao.list());
    }
}
