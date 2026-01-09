package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:02
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Librarian l = new Librarian("杜甫");
        Student s1 = new Student("张三","红色",'A');
        Student s2 = new Student("李四","红色",'B');
        Student s3 = new Student("李四","红色",'C');
        l.printBooks(s1);
        l.printBooks(s2);
        l.printBooks(s3);
        //第一题测试完毕
        Player p1 = new Player("李白","戴尔230",true,4);
        if(p1.checkLOLIsReady(p1)){
            System.out.println("可以玩LOL！");
        }
        //第二题测试完毕

        PersonFactory personFactory = new YangRope();
        Person man = personFactory.createPerson();
        man.talk("今天天气坏极了");
        personFactory = new YinRope();
        Person woman = personFactory.createPerson();
        woman.eat();
    }
}
