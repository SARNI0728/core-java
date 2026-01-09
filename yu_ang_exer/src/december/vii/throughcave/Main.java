package december.vii.throughcave;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Person p1 = new Person("Erik");
        Person p2 = new Person("Leo");
        Person p3 = new Person("Jess");

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();
    }
}
